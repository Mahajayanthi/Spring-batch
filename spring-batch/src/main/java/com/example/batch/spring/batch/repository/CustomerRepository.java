package com.example.batch.spring.batch.repository;

import com.example.batch.spring.batch.entity.Customer;
import org.hibernate.hql.internal.ast.tree.IdentNode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
