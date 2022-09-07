package com.hjx.completionserviceoom.controller;

import com.hjx.completionserviceoom.service.CompletionServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.concurrent.atomic.AtomicInteger;


@RestController
public class CompletionServiceController {

    private static AtomicInteger count = new AtomicInteger();
    @Autowired
    CompletionServiceService completionServiceService;

    @RequestMapping("/test1")
    public String test1(){
        completionServiceService.test1();
        int num = count.incrementAndGet();
        return num+"";
    }
}
