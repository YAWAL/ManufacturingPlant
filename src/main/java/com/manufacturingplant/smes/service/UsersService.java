package com.manufacturingplant.smes.service;

import com.manufacturingplant.smes.entity.Users;

/**
 * Created by VYA on 28.05.2016.
 */
public interface UsersService {

    public void addUser(Users users);

    public Users findUserById(int id);

    public Users findUserByEmail(String email);




}
