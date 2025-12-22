package com.example.boardTest.service;

import com.example.boardTest.entity.Board5;
import com.example.boardTest.repository.BoardRepository5;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 게시글(Board4)에 대한 비즈니스 로직을 담당하는 Service 계층
 *
 * - Controller와 Repository 사이의 중간 계층
 * - 트랜잭션 단위 및 비즈니스 규칙을 처리
 * - DB 접근은 Repository에 위임
 */
@Service
@RequiredArgsConstructor
public class BoardService5 {

    private final BoardRepository5 boardRepository5;

    /**
     * 전체 게시글을 조회한다.
     *
     * @return 게시글 목록
     */
    public List<Board5> findAll(){
        return boardRepository5.findAll();
    }

    /**
     * 게시글을 저장한다.
     *
     * @param board5 저장할 게시글 엔티티
     * @return 저장된 게시글
     */
    public Board5 save(Board5 board5){
        return boardRepository5.save(board5);
    }
}
