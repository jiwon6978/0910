package com.example.demo.Domain.Common.Repository;

import com.example.demo.Domain.Common.Entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void t1(){
//        List<User> list =userRepository.selectAllByRole("role_user");

//        List<User> list1 =userRepository.selectAllByRoleAndPwd("role_user","1234");
//        list1.forEach(System.out::println);
//
//        List<User> list2 =userRepository.selectAllByRole_2("role_admin");
//        list2.forEach(System.out::println);
        List<User> list3 = userRepository.selectAlllikeUserName("e");
        list3.forEach(System.out::println);

    }

    }
