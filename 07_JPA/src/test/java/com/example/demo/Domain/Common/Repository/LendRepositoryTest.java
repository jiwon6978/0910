package com.example.demo.Domain.Common.Repository;

import com.example.demo.Domain.Common.Entity.Book;
import com.example.demo.Domain.Common.Entity.Lend;
import com.example.demo.Domain.Common.Entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class LendRepositoryTest {

    @Autowired
    LendRepository lendRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    BookRepository bookRepository;

    @Test
    public void t1() {

//        List<Lend> list = lendRepository.findAll();
//        list.forEach(System.out::println);

        //INSERT
//        User user = userRepository.findById("user1").get();
//        Book book = bookRepository.findById(1L).get();
//        Lend lend = Lend.builder()
//                .id(null)
//                .user(user)
//                .book(book)
//                .build();
//        lendRepository.save(lend);
    }

    @Test
    public void t2() {
        //user1 북코드1 1대여
        //user1 북코드2 2L대여
        //user2 북코드3 3L대여
        //user3 북코드4 4L대여

//        User user = userRepository.findById("user1").get();
//        Book book = bookRepository.findById(1L).get();
//        Lend lend1 = Lend.builder()
//                .id(null)
//                .user(user)
//                .book(book)
//                .build();
//        lendRepository.save(lend1);

//        User user = userRepository.findById("user2").get();
//        Book book = bookRepository.findById(3L).get();
//        Lend lend2 = Lend.builder()
//                .id(null)
//                .user(user)
//                .book(book)
//                .build();
//        lendRepository.save(lend2);

        User user = userRepository.findById("user3").get();
        Book book = bookRepository.findById(4L).get();
        Lend lend3 = Lend.builder()
                .id(null)
                .user(user)
                .book(book)
                .build();
        lendRepository.save(lend3);

    }

    //도서대여를 한 회원중에서 user1인 경우
    @Test
    public void t3(){
//        List<Lend> list = lendRepository.findAllLandsByUser("user1");
//        list.forEach(System.out::println);

        List<Lend> list1 = lendRepository.findAllLandsByBook("TEST_BOOK");
        list1.forEach(System.out::println);

    }

    @Test
    @Transactional(rollbackFor=Exception.class)
    public void t4(){
        System.out.println("-----------Fetch TEST START");
        Optional<Lend> lendOptional = lendRepository.findById(1L);
        System.out.println("-----------lendRepository.findById -----");
        Lend lend = lendOptional.get();
        System.out.println("-----------lendOptional-----");
        User user = lend.getUser();
        System.out.println("-----------lend.getUser -----");
        Book book = lend.getBook();
        System.out.println("-----------lend.getBook-----");
        System.out.println("-----------Fetch TEST END");

    }

}