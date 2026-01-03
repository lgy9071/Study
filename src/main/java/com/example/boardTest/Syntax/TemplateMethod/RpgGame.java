package com.example.boardTest.Syntax.TemplateMethod;

// Game 클래스를 상속받은 RPG 게임
public class RpgGame extends Game {

    @Override
    protected void playing() {
        System.out.println("퀘스트를 수행하고 레벨업을 합니다.");
    }
}
