package com.example.boardTest.Syntax.polymorphism;

// Animal을 상속받은 Dog 클래스
public class Dog extends Animal {

    // 부모 메서드 오버라이딩
    @Override
    public void sound() {
        System.out.println("멍멍!");
    }
}
