package com.kernnautomations.kernndemo.controller;

import com.kernnautomations.kernndemo.model.Borrowing;
import com.kernnautomations.kernndemo.repository.BorrowingRepository;
import com.kernnautomations.kernndemo.service.BorrowingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/borrowings")
public class BorrowingController {

    @Autowired
    private BorrowingService BorrowingService;

    @PostMapping
    public Borrowing addBorrowing(@RequestBody Borrowing Borrowing) {
        return BorrowingService.addBorrowing(Borrowing);
    }

    @Autowired
    private BorrowingRepository borrowingRepository;

    @GetMapping
    public List<Borrowing> getAllBorrowings() {
        return borrowingRepository.findAll();
    }
}
