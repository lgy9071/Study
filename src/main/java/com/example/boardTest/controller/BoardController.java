package com.example.boardTest.controller;

import com.example.boardTest.entity.Board;
import com.example.boardTest.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/board")
    public String list(Model model){
        model.addAttribute("boards", boardService.findAll());
        return "board/list";
    }

    @GetMapping("/board/write")
    public String writeForm(){
        return "board/write";
    }

    @PostMapping("/board/write")
    public String write(Board board){
        boardService.save(board);
        return "redirect:/board";
    }

}
