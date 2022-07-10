package com.bootcamp.application.main.service.impl;

import com.bootcamp.application.main.dao.model.Transaction;
import com.bootcamp.application.main.dao.repository.TransactionDAO;
import com.bootcamp.application.main.service.TransactionService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionDAO transactionDAO;

    @Override
    public Flux<Transaction> findAllTransaction() {
        return transactionDAO.findAll();
    }

    @Override
    public Mono<Transaction> findById(ObjectId id) {
        return transactionDAO.findById(id);
    }
}
