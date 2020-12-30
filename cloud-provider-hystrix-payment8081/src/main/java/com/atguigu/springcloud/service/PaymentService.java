package com.atguigu.springcloud.service;

/**
 * @author HongChen
 * @date 2020/12/30 16:29
 */

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {
    public String paymentInfo_OK(Integer id){
        return "线程池  "+Thread.currentThread().getName()+"   paymentInfo_OK id:"+id+"\t";
    }
    public String paymentInfo_TimeOut(Integer id){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池  "+Thread.currentThread().getName()+"   paymentInfo_Timeout id:"+id+"\t耗时3秒钟";
    }
}
