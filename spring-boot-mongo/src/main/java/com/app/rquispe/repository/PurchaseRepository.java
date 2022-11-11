package com.app.rquispe.repository;

import com.app.rquispe.entity.Purchase;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PurchaseRepository extends MongoRepository<Purchase, Integer> {
}
