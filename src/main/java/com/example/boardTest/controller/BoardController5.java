package com.example.boardTest.controller;

import com.example.boardTest.entity.Board4;
import com.example.boardTest.entity.Board5;
import com.example.boardTest.service.BoardService4;
import com.example.boardTest.service.BoardService5;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 게시글(Board5)에 대한 요청을 처리하는 Controller
 *
 * - HTTP 요청을 받아 Service 계층에 위임
 * - 화면(View)에 전달할 데이터(Model)를 설정
 * - 비즈니스 로직은 포함하지 않는다
 */
@Controller
@RequiredArgsConstructor
public class BoardController5 {

    private final BoardService5 boardService5;

    @GetMapping("/board5")
    public String list(Model model){
        model.addAttribute("boards", boardService5.findAll());
        return "board5/list";
    }

    @GetMapping("board5/write")
    public String writeForm(){
        return "board5/write";
    }

    @PostMapping("board5/write")
    public String write(Board5 board5){
        boardService5.save(board5);
        return "redirect:/board5";
    }
}
