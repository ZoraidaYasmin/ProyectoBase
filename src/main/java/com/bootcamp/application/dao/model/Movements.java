package com.bootcamp.application.dao.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Movements {

    private Date dateMovements;
    private BigDecimal depositAmount;
    private String description;

}
