package com.example.demo.Domain.Common.Repository;


import com.example.demo.Domain.Common.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {


    //원하는 카테고리로 조회. findBy(콜롬이름인데 대문자로시작)
    List<Book> findByBookName(String bookName);
    List<Book> findByPublisher(String publisher);
    //유일한 값을 가지는 데이터는 List를 빼고 단건조회로 가능함
    Book findByIsbn(String isbn);
    List<Book> findByBookNameAndPublisher(String bookName,String publisher);
    List<Book> findByBookNameContains(String bookName);

}
