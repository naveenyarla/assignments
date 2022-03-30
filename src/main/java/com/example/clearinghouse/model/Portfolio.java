package com.example.clearinghouse.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Portfolio {
    private String Id;
    private String bankName;
    private String bankType;
    private String city;
    private String state;
    private String zipCode;

}
