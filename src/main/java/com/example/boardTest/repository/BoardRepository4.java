package com.example.boardTest.repository;

import com.example.boardTest.entity.Board4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository4 extends JpaRepository<Board4, Long> {
}
