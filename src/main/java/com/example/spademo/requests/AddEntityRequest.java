package com.example.spademo.requests;

import com.example.spademo.model.BudgetEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddEntityRequest {

    @CreatedDate
    public LocalDateTime createdOn;

    public String budgetName;
    public BudgetEntity entity;
    public String month;
}
