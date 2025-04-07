package com.kernnautomations.kernndemo.repository;

import com.kernnautomations.kernndemo.model.Borrowing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowingRepository extends JpaRepository<Borrowing, Long> {}
