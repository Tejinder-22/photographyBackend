package com.tejinder.photographyBackend.service;

import com.tejinder.photographyBackend.model.User;
import com.tejinder.photographyBackend.repo.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
@Service
public class UserService {

    @Autowired
    public Userrepo userrepo;

    public boolean adduser(User user)
    {
        try {
            userrepo.save(user); //data of class User
            return true;
        }
        catch (Exception e)
        {
            return false;
        }


    }
}
