package com.kernnautomations.kernndemo.service;

import com.kernnautomations.kernndemo.model.Member;
import com.kernnautomations.kernndemo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberRepository MemberRepo;

    public Member addMember(Member Member) {
        return MemberRepo.save(Member);
    }

    public List<Member> getAllMembers() {
        return MemberRepo.findAll();
    }
}
