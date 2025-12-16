package com.example.boardTest.controller;

import com.example.boardTest.entity.Board4;
import com.example.boardTest.service.BoardService4;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class BoardController4 {

    private final BoardService4 boardService4;

    @GetMapping("/board4")
    public String list(Model model){
        model.addAttribute("boards", boardService4.findAll());
        return "board4/list";
    }

    @GetMapping("board4/write")
    public String writeForm(){
        return "board4/write";
    }

    @PostMapping("board4/write")
    public String write(Board4 board4){
        boardService4.save(board4);
        return "redirect:/board4";
    }
}
