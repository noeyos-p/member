package com.my.member.repository;

import com.my.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// 선택 사항
public interface MemberRepository extends JpaRepository<Member, Long> {
    // Member entity 와 Member table 연결 Long 이라는 키를 가지고
}
