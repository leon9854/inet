package com.inet.comsulting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inet.comsulting.model.Product;

public interface IInetDao extends JpaRepository<Product, Long> {

}
