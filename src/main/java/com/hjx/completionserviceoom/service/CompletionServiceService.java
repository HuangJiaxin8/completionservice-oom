package com.hjx.completionserviceoom.service;

import org.springframework.stereotype.Service;
import java.util.concurrent.CompletionService;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;

@Service
public class CompletionServiceService {

    private static Executor executor = Executors.newFixedThreadPool(10);
    private static CompletionService<String> service = new ExecutorCompletionService<>(executor);

    public String test1(){
        for (int i = 0; i < 50; i++) {
            service.submit(()->{
                return "HelloWorld--" + Thread.currentThread().getName();
            });
        }
        return "";
    }
}
