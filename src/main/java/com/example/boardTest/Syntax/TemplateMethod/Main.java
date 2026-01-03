package com.example.boardTest.Syntax.TemplateMethod;

public class Main {
    public static void main(String[] args) {

        Game fps = new FpsGame();
        Game rpg = new RpgGame();

        fps.play();
        System.out.println("------");
        rpg.play();
    }
}
