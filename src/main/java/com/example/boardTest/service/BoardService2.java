package com.example.boardTest.service;

import com.example.boardTest.entity.Board2;
import com.example.boardTest.repository.BoardRepository2;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService2 {

    private final BoardRepository2 boardRepository2;

    public List<Board2> finalAll(){
        return boardRepository2.findAll();
    }

    public Board2 save(Board2 board2){
        return boardRepository2.save(board2);
    }
}
