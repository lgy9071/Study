package com.example.boardTest.Syntax.polymorphism;

public class Main {
    public static void main(String[] args) {

        // 다형성 핵심
        // 부모 타입 변수로 자식 객체를 참조
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // 컴파일 시점에는 Animal 타입이지만
        // 실행 시점에는 실제 객체(Dog, Cat)의 메서드가 호출됨
        animal1.sound(); // 멍멍!
        animal2.sound(); // 야옹!
    }
}
