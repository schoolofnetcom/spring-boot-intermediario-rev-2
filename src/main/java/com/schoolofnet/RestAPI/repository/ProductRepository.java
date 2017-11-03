package com.schoolofnet.RestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.schoolofnet.RestAPI.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
