package com.example.boardTest.Array;

import java.util.Scanner;

/**
 * 배열을 사용하여 간단한 사용자 관리(추가/조회/삭제)를 구현한 예제
 * - 배열 크기는 고정(5)
 * - count 변수로 실제 저장된 데이터 개수 관리
 */
public class InfiniteArrayPractice6 {

    // 사용자 이름을 저장할 배열
    static String[] users = new String[5];

    // 현재 저장된 사용자 수 (배열의 실제 사용 크기)
    static int count = 0;

    public static void main(String[] args) {

        // 콘솔 입력을 받기 위한 Scanner 객체
        Scanner sc = new Scanner(System.in);

        // 프로그램 종료 전까지 무한 반복
        while (true) {
            System.out.println("\n=== 메뉴 ===");
            System.out.println("1. 사용자 추가");
            System.out.println("2. 사용자 목록");
            System.out.println("3. 사용자 삭제");
            System.out.println("4. 종료");
            System.out.print("선택: ");

            // 메뉴 번호 입력
            int menu = sc.nextInt();
            sc.nextLine(); // nextInt() 후 남아있는 개행 문자 제거

            // 입력한 메뉴에 따라 기능 분기
            switch (menu) {
                case 1:
                    addUser(sc);   // 사용자 추가
                    break;
                case 2:
                    printUsers(); // 사용자 목록 출력
                    break;
                case 3:
                    removeUser(sc); // 사용자 삭제
                    break;
                case 4:
                    System.out.println("종료합니다.");
                    return; // main 메서드 종료 → 프로그램 종료
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    /**
     * 사용자 추가 메서드
     * @param sc Scanner 객체 (입력용)
     */
    static void addUser(Scanner sc) {

        // 배열이 가득 찼는지 확인
        if (count == users.length) {
            System.out.println("배열이 가득 찼습니다.");
            return;
        }

        // 추가할 사용자 이름 입력
        System.out.print("추가할 이름: ");
        String name = sc.nextLine();

        // 현재 count 위치에 사용자 저장 후 count 증가
        users[count++] = name;

        System.out.println("추가 완료");
    }

    /**
     * 사용자 목록 출력 메서드
     */
    static void printUsers() {

        // 등록된 사용자가 없는 경우
        if (count == 0) {
            System.out.println("등록된 사용자가 없습니다.");
            return;
        }

        // 실제 저장된 사용자(count)만 출력
        for (int i = 0; i < count; i++) {
            System.out.println(i + " : " + users[i]);
        }
    }

    /**
     * 사용자 삭제 메서드
     * @param sc Scanner 객체 (입력용)
     */
    static void removeUser(Scanner sc) {

        // 삭제할 사용자가 없는 경우
        if (count == 0) {
            System.out.println("삭제할 사용자가 없습니다.");
            return;
        }

        // 삭제할 인덱스 입력
        System.out.print("삭제할 인덱스: ");
        int index = sc.nextInt();
        sc.nextLine(); // 개행 제거

        // 인덱스 범위 검사
        if (index < 0 || index >= count) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }

        // 삭제된 위치부터 뒤의 요소들을 한 칸씩 앞으로 이동
        for (int i = index; i < count - 1; i++) {
            users[i] = users[i + 1];
        }

        // 마지막 요소 제거 및 count 감소
        users[--count] = null;

        System.out.println("삭제 완료");
    }
}
