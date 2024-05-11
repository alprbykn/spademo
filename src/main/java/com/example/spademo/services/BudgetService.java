package com.example.spademo.services;

import com.example.spademo.model.Budget;
import com.example.spademo.model.BudgetEntity;
import com.example.spademo.repo.BudgetRepository;
import com.example.spademo.requests.AddEntityRequest;
import org.springframework.beans.factory.annotation.Autowired;
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
            BudgetEntity budgetEntity = new BudgetEntity();

            if (addEntityRequest.getEntity().getProductName() != null) {
                budgetEntity.setProductName(addEntityRequest.getEntity().getProductName());
            }
            if (addEntityRequest.getEntity().getAmount() != null) {
                budgetEntity.setAmount(addEntityRequest.getEntity().getAmount());
            }
            if (addEntityRequest.getEntity().getExchangeRate() != null) {
                budgetEntity.setExchangeRate(addEntityRequest.getEntity().getExchangeRate());
            }
            if (addEntityRequest.getEntity().getPrice() != null) {
                budgetEntity.setPrice(addEntityRequest.getEntity().getPrice());
            }


            budget.getMonths().get(addEntityRequest.getMonth()).add(budgetEntity);
            budgetRepository.save(budget);
        }
    }
    public void addEntityReality(AddEntityRequest addEntityRequest) {

        Budget budget = budgetRepository.findByName(addEntityRequest.getBudgetName());
        if(budget!=null){
            budget.getRealMonths().get(addEntityRequest.getMonth()).add(addEntityRequest.getEntity());
            budgetRepository.save(budget);
        }
    }

    public Budget getBudget(String name) {
        return budgetRepository.findByName(name);
    }
}