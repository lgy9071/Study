package com.example.boardTest.Syntax.TemplateMethod;

// Game 클래스를 상속받은 FPS 게임
public class FpsGame extends Game {

    @Override
    protected void playing() {
        System.out.println("총을 쏘며 적을 물리칩니다.");
    }
}
