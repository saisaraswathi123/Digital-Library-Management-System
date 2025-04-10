package com.kernnautomations.kernndemo.controller;

import com.kernnautomations.kernndemo.model.Member;
import com.kernnautomations.kernndemo.repository.MemberRepository;
import com.kernnautomations.kernndemo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    @Autowired
    private MemberService MemberService;

    @PostMapping
    public Member addMember(@RequestBody Member Member) {
        return MemberService.addMember(Member);
    }

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
