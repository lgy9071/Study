package com.example.boardTest.service;

import com.example.boardTest.entity.Board;
import com.example.boardTest.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public List<Board> findAll(){
        return boardRepository.findAll();
    }

    public Board save(Board board){
        return boardRepository.save(board);
    }
}
