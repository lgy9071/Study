package com.example.boardTest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Board5 {

    /*이 필드가 “기본 키(PK)”라는 걸 JPA에게 알려줌
    엔티티 식별자(Identity) 역할
    이게 없으면 엔티티로 인식 자체가 안 됨
    JPA는 @Id가 반드시 1개 이상 있어야 함*/
    @Id
    /*PK 값을 어떻게 생성할지 전략만 지정
    자동 생성 여부 / 방식에 대한 설정일 뿐
    @Id 없이 단독으로 쓰면 의미 없음*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;

    // 기본 생성자 = JPA 객체 생성 필수 요건
    public Board5(){
    }

    // 객체를 “의미 있는 상태”로 만들기 위해
    //생성과 동시에 필요한 값 세팅
    //가독성 ↑
    //실수로 빈 객체 만드는 것 방지
    public Board5(String title, String content){
        this.title = title;
        this.content = content;
    }

    // 캡슐화 + 프레임워크 호환
    public Long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    // 상태 변경 (하지만 제한적으로)
    public void setTitle(String title){
        this.title = title;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

}
