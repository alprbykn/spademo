package com.example.spademo.services;

import com.example.spademo.model.Budget;
import com.example.spademo.repo.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BudgetService {

    @Autowired
    private BudgetRepository budgetRepository;


    @Autowired
    public BudgetService(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    public void createBudget(Budget budget) {
         budgetRepository.save(budget);
    }

}