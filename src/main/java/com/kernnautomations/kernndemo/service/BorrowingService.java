package com.kernnautomations.kernndemo.service;

import com.kernnautomations.kernndemo.model.Borrowing;
import com.kernnautomations.kernndemo.repository.BorrowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowingService {
    @Autowired
    private BorrowingRepository BorrowingRepo;

    public Borrowing addBorrowing(Borrowing Borrowing) {
        return BorrowingRepo.save(Borrowing);
    }

    public List<Borrowing> getAllBorrowings() {
        return BorrowingRepo.findAll();
    }
}
