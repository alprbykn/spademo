package com.example.spademo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BudgetEntity {
    @Id
    public String id;

    @CreatedDate
    public LocalDateTime createdOn;

    public String productName;
    public Integer amount;
    public Integer price;
    public Integer exchangeRate;

}
