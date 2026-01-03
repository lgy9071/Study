package com.example.boardTest.Syntax.TemplateMethod;

// 추상 클래스: 전체 알고리즘의 뼈대를 정의
public abstract class Game {

    // 템플릿 메서드
    // 알고리즘의 전체 흐름을 정의
    // 자식이 함부로 수정하지 못하게 final
    public final void play() {
        start();
        playing();
        end();
    }

    // 공통 메서드 (구현 제공)
    protected void start() {
        System.out.println("게임을 시작합니다.");
    }

    protected void end() {
        System.out.println("게임을 종료합니다.");
    }

    // 추상 메서드 (자식이 반드시 구현)
    protected abstract void playing();
}
