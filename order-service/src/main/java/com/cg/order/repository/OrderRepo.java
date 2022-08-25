package com.cg.order.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.order.models.OrderDetails;
@Repository
public interface OrderRepo extends MongoRepository<OrderDetails, Integer>
{
boolean save(Long id);

}
