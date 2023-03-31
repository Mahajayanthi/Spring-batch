package com.example.scheduler.springbatchscheduler.repository;

import com.example.scheduler.springbatchscheduler.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
