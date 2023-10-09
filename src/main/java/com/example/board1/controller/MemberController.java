package com.example.board1.controller;

import com.example.board1.domain.entity.Member;
import com.example.board1.sevice.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/member")
@CrossOrigin("*")
public class MemberController {
    private final MemberService memberService;

    @PostMapping
     public void save(@RequestBody Member member) {
        memberService.save(member);
    }

    @GetMapping
    public List<Member> findAll() {
        return memberService.findAll();
    }

    @DeleteMapping("/{name}")
    public void delete(@PathVariable String name) {
        memberService.deleteById(name);
    }

    @PutMapping("/{name}")
    public void update(@PathVariable String name, @RequestBody Member member) {
        memberService.update(name, member);
    }
}
