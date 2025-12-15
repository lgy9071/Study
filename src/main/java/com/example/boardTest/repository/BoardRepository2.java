package com.example.boardTest.repository;

import com.example.boardTest.entity.Board2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository2 extends JpaRepository<Board2, Long> {
}
