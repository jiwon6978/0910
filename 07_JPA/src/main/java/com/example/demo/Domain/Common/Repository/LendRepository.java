package com.example.demo.Domain.Common.Repository;


import com.example.demo.Domain.Common.Entity.Lend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LendRepository extends JpaRepository<Lend,Long> {


    //쿼리문에서 파란글씨는 대문자로 바꿈  ( 도서대여한 회원 중에서 user1인 사람 )
    @Query("SELECT l FROM Lend AS l JOIN FETCH l.user WHERE l.user.username=:username")
    List<Lend> findAllLandsByUser(@Param("username")String un);

    //도서 대여 상태인 것만 조회
    @Query("SELECT l FROM Lend AS l JOIN FETCH l.book WHERE l.book.bookName=:bookname")
    List<Lend> findAllLandsByBook (@Param ("bookname")String bookName);

}
