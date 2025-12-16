package com.example.boardTest.service;

import com.example.boardTest.entity.Board4;
import com.example.boardTest.repository.BoardRepository4;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService4 {

    private final BoardRepository4 boardRepository4;

    public List<Board4> findAll(){
        return boardRepository4.findAll();
    }

    public Board4 save(Board4 board4){
        return boardRepository4.save(board4);
    }
}
