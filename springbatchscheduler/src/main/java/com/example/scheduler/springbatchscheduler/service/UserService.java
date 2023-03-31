package com.example.scheduler.springbatchscheduler.service;

import com.example.scheduler.springbatchscheduler.entity.User;
import com.example.scheduler.springbatchscheduler.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;
    Logger log= LoggerFactory.getLogger(UserService.class);

    //schedule a job to add object in the DB(Every 5 seconds)
    @Scheduled(fixedRate = 5000)
    public void add2DBJob()
    {
        User user =new User();
        user.setName("user"+new Random().nextInt(374483));
        repo.save(user);
        System.out.println("add service call in"+new Date().toString());
    }
    @Scheduled(cron="0/15 * * * * *")
    public void fetchDB()
    {
        List<User> user=repo.findAll();
        System.out.println("fetch service call in  "+new Date().toString());
        System.out.println("no of record fetched:"+user.size());
        log.info("users:{}",user);

    }

}
