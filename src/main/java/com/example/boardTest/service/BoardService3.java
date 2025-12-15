package com.example.boardTest.service;

import com.example.boardTest.entity.Board3;
import com.example.boardTest.repository.BoardRepository3;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService3 {

    private final BoardRepository3 boardRepository3;

    public List<Board3> findAll(){
        return boardRepository3.findAll();
    }

    public Board3 save(Board3 board3){
        return boardRepository3.save(board3);
    }
}
