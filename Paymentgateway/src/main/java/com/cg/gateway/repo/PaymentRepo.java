package com.cg.gateway.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.gateway.model.Payment;

public interface PaymentRepo extends MongoRepository<Payment, String> {

}
