package com.kernnautomations.kernndemo.repository;

import com.kernnautomations.kernndemo.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {}
