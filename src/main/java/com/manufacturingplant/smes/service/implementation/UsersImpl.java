package com.manufacturingplant.smes.service.implementation;

import com.manufacturingplant.smes.dao.UsersDao;
import com.manufacturingplant.smes.entity.Users;
import com.manufacturingplant.smes.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by VYA on 28.05.2016.
 */
@Service
public class UsersImpl implements UsersService, UserDetailsService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Users users = null;
        try {
            users = usersDao.findUserByEmail(email);
        }catch (NoResultException e){
            return null;
        }
        List<SimpleGrantedAuthority> authorityList = new ArrayList<>();
        authorityList.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new User(String.valueOf(users.getUserId()), users.getPassword(),authorityList);
    }

    @Override
    public void addUser(Users users) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        usersDao.addUser(users);
    }

    @Override
    public Users findUserById(int id) {
        return usersDao.findUserByID(id);
    }

    @Override
    public Users findUserByEmail(String email) {
        return usersDao.findUserByEmail(email);
    }


}
