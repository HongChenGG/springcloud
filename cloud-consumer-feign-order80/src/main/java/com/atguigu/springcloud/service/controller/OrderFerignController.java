package com.atguigu.springcloud.service.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author HongChen
 * @date 2020/12/30 10:55
 */
@RestController
@Slf4j
public class OrderFerignController {
    @Resource
    private PaymentFeignService paymentFeignService;
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentId(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
 }
