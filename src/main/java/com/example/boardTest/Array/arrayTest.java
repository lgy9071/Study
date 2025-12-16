package com.example.boardTest.Array;

public class arrayTest {

    public static void main(String[] args) {

        String[] users = new String[5];
        int count = 0;

        // 데이터 추가
        users[count++] = "kim";
        users[count++] = "lee";
        users[count++] = "park";

        // 삭제할 인덱스 (예: lee)
        int index = 1;

        // 앞으로 당기기
        for (int i = index; i < count - 1; i++) {
            users[i] = users[i + 1];
        }

        users[--count] = null;

        // 결과 확인
        for (int i = 0; i < users.length; i++) {
            System.out.println(i + " : " + users[i]);
        }
    }
}
