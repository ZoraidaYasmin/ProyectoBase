package com.bootcamp.application.main.dao.repository;

import com.bootcamp.application.main.dao.model.Transaction;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TransactionDAO extends ReactiveMongoRepository<Transaction, ObjectId> {


}
