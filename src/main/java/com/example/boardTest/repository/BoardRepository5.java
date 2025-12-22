package com.example.boardTest.repository;

import com.example.boardTest.entity.Board5;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Board5 엔티티에 대한 영속성 처리를 담당하는 Repository
 *
 * - Service 계층에서 DB 접근 로직을 분리하기 위해 사용
 * - Spring Data JPA가 구현체를 자동 생성
 */
@Repository
public interface BoardRepository5 extends JpaRepository<Board5, Long> {
}
