package com.bootcamp.application.main.controller;

import com.bootcamp.application.main.dao.model.Transaction;
import com.bootcamp.application.main.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/api/bank")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @RequestMapping("/transactionList")
    public Mono<ResponseEntity<Flux<Transaction>>> TransactionList(){
        return Mono.just(
          ResponseEntity.ok().
          contentType(MediaType.APPLICATION_JSON_UTF8).
          body(transactionService.findAllTransaction())
        );
    }

}
