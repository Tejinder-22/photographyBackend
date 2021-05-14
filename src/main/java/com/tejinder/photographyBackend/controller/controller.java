package com.tejinder.photographyBackend.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tejinder.photographyBackend.model.User;
import com.tejinder.photographyBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    public UserService userservice;


    @RequestMapping(value = "/on",method = RequestMethod.POST)

    public  void hello(@RequestBody  String data) throws JsonProcessingException {
        User user = new ObjectMapper().readValue(data,User.class);
          if(userservice.adduser(user))
          {
              System.out.println("done");
          }
          else
          {
              System.out.println("not posted");
          }


    }
}
