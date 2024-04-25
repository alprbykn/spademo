package com.example.spademo.services;

import com.example.spademo.model.Budget;
import com.example.spademo.model.MonthEntities;
import com.example.spademo.repo.BudgetRepository;
import com.example.spademo.requests.AddEntityRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


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

    public List<Budget> getBudgets() {
       return budgetRepository.findAll();
    }

    public void delete() {  budgetRepository.deleteAll();
    }

    public void addEntity(AddEntityRequest addEntityRequest) {

        Budget budget = budgetRepository.findByName(addEntityRequest.getBudgetName());
        if(budget!=null){
            budget.getMonths().get(addEntityRequest.getMonth()).add(addEntityRequest.getEntity());
            budgetRepository.save(budget);
        }
    }

    public Budget getBudget(String name) {
        return budgetRepository.findByName(name);
    }
}