package com.example.spademo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "budgets")
public class Budget {
    @Id
    public String id;
    public String name;
    public HashMap<String, List<BudgetEntity>> months;
    public HashMap<String, List<BudgetEntity>> realMonths;

    @CreatedDate
    public LocalDateTime createdOn;

    @LastModifiedDate
    public LocalDateTime modifiedOn;
}
