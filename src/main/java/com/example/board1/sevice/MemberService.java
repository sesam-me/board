package com.example.board1.sevice;

import com.example.board1.domain.entity.Member;
import com.example.board1.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void save(Member member) {
        memberRepository.save(member);
    }

    public List<Member> findAll(){
        return memberRepository.findAll();
    }

    @Transactional // 이거 왜 해줘야 함?
    public void deleteById(String name) {
        memberRepository.deleteByName(name);
    }
    @Transactional
    public void update(String name, Member member) {
        Member allByName = memberRepository.findByName(name);
        allByName.setDescription(member.getDescription());
//
//
//        Member Member = com.example.board1.domain.entity.Member.builder()
//                .name(member.getName())
//                .description(member.getDescription())
//                .build();
//
//        memberRepository.save(member);
    }
}
