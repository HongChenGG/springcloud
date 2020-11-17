package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author HongChen
 * @date 2020/11/3 16:29
 */
@RestController
@Slf4j
public class paymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;
    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果:"+result);
        if(result>0){
            return  new CommonResult(200,"插入数据成功,serverPort："+serverPort,result);
        }
        else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info("查询结果:"+result);
        if(result!=null){
            return  new CommonResult(200,"查询数据成功,serverPort："+serverPort,result);
        }
        else{
            return new CommonResult(444,"没有对应记录，查询ID:"+id,null);
        }
    }

}
