package com.example.demo.Domain.Common.Repository;

import com.example.demo.Domain.Common.Entity.Book;
import org.junit.jupiter.api.AutoClose;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @DisplayName("확인")
    @Test
    public void t1(){
        Book book = Book.builder()
                .bookCode(1L)
                .bookName("정석")
                .publisher("이지")
                .isbn("222-111")
                .build();


        //INSERT
//        bookRepository.save(book);

        //UPDATE
//        bookRepository.save(book);
        //DELETE
//        bookRepository.deleteById(1L);

        //SELECT
        //단건조회
//        Optional<Book> bo =
//        bookRepository.findById(1L);
//        Book rbook = null;
//        if(bo.isPresent()){
//            rbook = bo.get();
//            System.out.println(rbook);
//        }
//
//        //다건조회 -  페이징 처리 필요함
//        List<Book> list =
//        bookRepository.findAll();
//        list.forEach(System.out::println);
    }
    @DisplayName("함수명명법")
    @Test
    public void t2(){
//        List<Book> list = bookRepository.findByBookName("a");
//        list.forEach(System.out::println);
//
//        List<Book> list1 =bookRepository.findByPublisher("a3");
//        list.forEach(System.out::println);
//
//        List<Book> list2 =bookRepository.findByBookNameAndPublisher("a","b3");
//        list2.forEach(System.out::println);
        List<Book> list3 = bookRepository.findByBookNameContains("a");
        list3.forEach(System.out::println);

    }

}