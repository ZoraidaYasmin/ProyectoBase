package com.bootcamp.application.service;

import com.bootcamp.application.dao.model.Transaction;
import com.bootcamp.application.dao.repository.TransactionDAO;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TransactionServiceImpl implements TransactionService{

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
