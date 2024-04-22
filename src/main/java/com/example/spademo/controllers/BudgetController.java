package com.example.spademo.controllers;

import com.example.spademo.model.Budget;
import com.example.spademo.services.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@CrossOrigin("*")
@MessageMapping("/app/currentTime")
public class BudgetController {
    @Autowired
    private BudgetService budgetService;

    @PostMapping("/createBudget")
    public ResponseEntity createBudget(
            @RequestBody Budget budget) {
        budgetService.createBudget(budget);

        return ResponseEntity.ok(HttpStatus.OK);
    }
}