package com.example.board1.repository;

import com.example.board1.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository <Member, Long> {
    void deleteByName(String name);
    Member findByName(String name);
}
