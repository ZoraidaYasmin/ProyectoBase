package com.bootcamp.application.main.service;

import com.bootcamp.application.main.dao.model.Transaction;
import org.bson.types.ObjectId;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransactionService {

    Flux<Transaction> findAllTransaction();
    Mono<Transaction> findById(ObjectId id);

}
