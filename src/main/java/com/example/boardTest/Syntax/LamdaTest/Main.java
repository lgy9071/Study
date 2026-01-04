package com.example.boardTest.Syntax.LamdaTest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 일반적인 리스트 생성
        List<Integer> scores = new ArrayList<>();
        scores.add(95);
        scores.add(82);
        scores.add(67);
        scores.add(74);
        scores.add(88);

        /*
         * Stream이란?
         * - 컬렉션을 "데이터 흐름"으로 다루는 방식
         * - 반복문(for) 없이 데이터 처리 가능
         */

        scores.stream()                 // 리스트 → 스트림 생성
                .filter(score -> score >= 80)
                // 람다식: (매개변수 -> 실행문)
                // score >= 80 인 데이터만 통과

                .map(score -> score + 5)
                // 각 요소를 5점씩 증가시킴

                .forEach(score -> System.out.println(score));
        // 최종 결과 하나씩 출력
    }
}
