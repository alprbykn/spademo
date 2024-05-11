package com.example.spademo.controllers;

import com.example.spademo.model.Budget;
import com.example.spademo.requests.AddEntityRequest;
import com.example.spademo.services.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v3/budgets")
public class BudgetController {
    @Autowired
    private BudgetService budgetService;

    @PostMapping("/createBudget")
    public ResponseEntity createBudget(
            @RequestBody Budget budget) {

        budgetService.createBudget(budget);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    @PostMapping("/addBudgetEntity")
    public ResponseEntity addBudgetEntity(
            @RequestBody AddEntityRequest addEntityRequest) {

        budgetService.addEntity(addEntityRequest);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    @PostMapping("/addBudgetExpectation")
    public ResponseEntity addBudgetExpectation(
            @RequestBody AddEntityRequest addEntityRequest) {

        budgetService.addEntity(addEntityRequest);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    @PostMapping("/addBudgetReality")
    public ResponseEntity addBudgetReality(
            @RequestBody AddEntityRequest addEntityRequest) {

        budgetService.addEntityReality(addEntityRequest);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/getBudgets")
    public List<Budget> getBudgets() {
        return budgetService.getBudgets();

    }
    @GetMapping("/getBudget")
    public Budget getBudget(@RequestParam String name) {
        return budgetService.getBudget(name);

    }
    @GetMapping("/delete")
    public void delete() {
         budgetService.delete();


    }
}