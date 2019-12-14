package com.chhliu.springbootmysqldemo.repository;

import com.chhliu.springbootmysqldemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}  
