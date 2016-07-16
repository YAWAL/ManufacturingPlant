package com.manufacturingplant.smes.entity;

import javax.persistence.*;

/**
 * Created by VYA on 27.05.2016.
 */

@Entity
@NamedQueries({
        @NamedQuery(name="Users.findUserByEmail", query = "SELECT u FROM Users u where u.email like :email or u.password like :password")
})
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int userId;

    @Column
    private String password;

    @Column
    private String email;

    public Users() {
    }

    public Users(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
