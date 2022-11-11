package com.app.rquispe.controller;

import com.app.rquispe.entity.Purchase;
import com.app.rquispe.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

  private final PurchaseRepository repository;

  @Autowired
  public PurchaseController(PurchaseRepository repository) {
    this.repository = repository;
  }

  @PostMapping
  public void store(@RequestBody Purchase purchase) {
    repository.save(purchase);
  }

  @GetMapping
  public List<Purchase> find() {
    return repository.findAll();
  }
}
