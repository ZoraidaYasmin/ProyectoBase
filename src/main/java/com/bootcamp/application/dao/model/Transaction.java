package com.bootcamp.application.dao.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Data
@Document(collection = "transaction")
public class Transaction {

    @BsonId
    @JsonSerialize(using = ToStringSerializer.class)
    private List<ObjectId> id;

    @BsonId
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId productId;

    private String accountNumber;
    private int movementLimit;
    private BigDecimal creditLimit;
    private BigDecimal availableBalance;
    private BigDecimal maintenanceCommission;
    private String cardNumber;
    private boolean withdrawalIndicator;
    private Date RetirementDateFixedTerm;
    private Signatory signatory;
    private List<Movements> deposit;
    private List<Movements> withdrawals;
    private List<Movements> payments;
    private List<Movements> buy;
    private Audit audit;



}
