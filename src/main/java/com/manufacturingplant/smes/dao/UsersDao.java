package com.manufacturingplant.smes.dao;

import com.manufacturingplant.smes.entity.Users;

/**
 * Created by VYA on 28.05.2016.
 */
public interface UsersDao {

    public void addUser(Users users);

    public Users findUserByEmail(String email);

    public Users findUserByID(int userId);


}
