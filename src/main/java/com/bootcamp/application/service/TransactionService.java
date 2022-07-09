package com.bootcamp.application.service;

import com.bootcamp.application.dao.model.Transaction;
import org.bson.types.ObjectId;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransactionService {

    Flux<Transaction> findAllTransaction();
    Mono<Transaction> findById(ObjectId id);

}
