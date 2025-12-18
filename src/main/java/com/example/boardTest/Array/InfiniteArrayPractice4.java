package com.example.boardTest.Array;

import java.util.Scanner;

public class InfiniteArrayPractice4 {

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
    static void addUser(Scanner sc){
        if(count == users.length){
            System.out.println("배열이 가득 찼습니다.");
            return;
        }
        System.out.println("추가할 이름: ");
        String name = sc.nextLine();

        users[count++] = name;
        System.out.println("추가 완료");
    }

    // 사용자 목록 출력
    static void printUsers(){
        if(count == 0){
            System.out.println("등록된 사용자가 없습니다.");
            return;
        }

        for (int i = 0; i < count; i++){
            System.out.println(i + " : " + users[i]);
        }
    }

    // 사용자 삭제
    static void removeUser(Scanner sc){
        if (count == 0){
            System.out.println("삭제할 사용자가 없습니다.");
            return;
        }

        System.out.println("삭제할 인덱스: ");
        int index = sc.nextInt();
        sc.nextLine();

        if(index < 0 || index >= count){
            System.out.println("잘못된 인덱스입니다.");
            return;
        }

        for(int i = index; i < count - 1; i++){
            users[i] = users[i = 1];
        }

        users[--count] = null;
        System.out.println("삭제 완료");
    }

}
