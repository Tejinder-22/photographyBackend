package com.tejinder.photographyBackend.repo;

import com.tejinder.photographyBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//interface reduce conf wala code
@Repository
public interface Userrepo extends JpaRepository<User,String> {

}
