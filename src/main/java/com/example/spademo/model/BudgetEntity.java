package com.example.spademo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BudgetEntity {
    @Id
    public Integer id;
    public Product productName;
    public Integer amount;
    public Integer price;
}
