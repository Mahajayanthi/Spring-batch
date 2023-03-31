//package com.example.batch.spring.batch.config;
//
//import org.springframework.batch.core.*;
//import org.springframework.batch.core.launch.JobLauncher;
//import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
//import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
//import org.springframework.batch.core.repository.JobRestartException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//@Component
//@EnableScheduling
//public class MyScheduler {
//
//    @Autowired
//    private JobLauncher joblauncher;
//
//    @Autowired
//    private Job job;
//
//    @Scheduled(cron = "*/10 * * * * *")//every 10 second the batch processing is trigger and run automatically
//    public void myScheduler() {
//        JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis()).toJobParameters();
//        try {
//            JobExecution jobExecution = joblauncher.run(job, jobParameters);
//            System.out.println("Job's status : : :" + jobExecution.getStatus());
//            System.out.println();
//        } catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException |
//                 JobParametersInvalidException e) {
//            e.printStackTrace();
//        }
//    }
//}
