package com.example.boardTest.controller;

import com.example.boardTest.entity.Board2;
import com.example.boardTest.service.BoardService2;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BoardController2 {

    private final BoardService2 boardService2;

    @GetMapping("/board")
    public String list(Model model){
        model.addAttribute("boards", boardService2.finalAll());
        return "board/list";
    }

    @GetMapping("/board/write")
    public String writeForm(){
        return "board/write";
    }

    @GetMapping("/board/write")
    public String write(Board2 board2){
        boardService2.save(board2);
        return "redirect:/board";
    }
}
