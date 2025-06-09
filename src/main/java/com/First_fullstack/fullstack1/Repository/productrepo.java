package com.First_fullstack.fullstack1.Repository;

import com.First_fullstack.fullstack1.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productrepo extends JpaRepository<Product, Integer> {
}
