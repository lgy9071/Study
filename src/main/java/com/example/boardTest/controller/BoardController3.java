package com.example.boardTest.controller;

import com.example.boardTest.entity.Board3;
import com.example.boardTest.service.BoardService3;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class BoardController3 {

    private final BoardService3 boardService3;

    @GetMapping("/board3")
    public String list(Model model){
        model.addAttribute("boards", boardService3.findAll());
        return "board3/list";
    }

    @GetMapping("/board3/write")
    public String writeForm(){
        return "board3/write";
    }

    @PostMapping("/board3/write")
    public String write(Board3 board3){
        boardService3.save(board3);
        return "redirect:/board3";
    }

}
