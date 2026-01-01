package com.example.boardTest.Syntax.encapsulation;

public class PersonMain {

    public class Main {
        public static void main(String[] args) {
            Person p = new Person("민수", 20);
            p.setAge(-5);        // 거부됨
            System.out.println(p.getAge()); // 20
        }
    }

}
