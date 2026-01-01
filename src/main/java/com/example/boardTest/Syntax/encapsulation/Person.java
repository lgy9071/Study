package com.example.boardTest.Syntax.encapsulation;

public class Person {
    private String name;
    private int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // setter 사용
    }

    // getter
    public int getAge() {
        return age;
    }

    // setter (검증 로직 포함)
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("나이는 0 이상이어야 합니다.");
            return;
        }
        this.age = age;
    }
}

