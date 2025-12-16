package com.example.boardTest.Array;

import java.util.Scanner;

import static com.example.boardTest.Array.InfiniteArrayPractice.*;

public class InfiniteArrayPractice2 {

    static String[] users = new String[5];
    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\n=== 메뉴 ===");
            System.out.println("1. 사용자 추가");
            System.out.println("2. 사용자 목록");
            System.out.println("3. 사용자 삭제");
            System.out.println("4. 종료");
            System.out.println("선택: ");

            int menu = sc.nextInt();
            sc.nextLine(); // 개행 제거

            switch (menu){
                case 1:
                    addUser(sc);
                    break;
                case 2:
                    printUsers();
                    break;
                case 3:
                    removeUser(sc);
                    break;
                case 4:
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    // 사용자 추가

    // 사용자 목록 출력

    // 사용자 삭제


}
