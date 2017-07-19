package com.cloud.webservice.service;

import com.cloud.webservice.controller.vo.DealerBrand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.List;


/**
 * Created by yuanjinglin on 17/7/18.
 */
@Service
public class DealerBrandService {
    @Autowired
    RestTemplate restTemplate;
    final String SERVICE_NAME="spring-boot-mybatis-demo";

    @HystrixCommand(fallbackMethod = "fallbackSearchAll")
    public List<DealerBrand> searchAll(){
       List<DealerBrand> list= restTemplate.getForObject("http://"+SERVICE_NAME+"/dealerBrand/queryAll", List.class);
        System.out.println(list.size());
        return list;
    }

    /**
     * 返回需与上面的一致,否则调用会报异常
     * @return
     */
    private List<DealerBrand> fallbackSearchAll() {
        System.out.println("HystrixCommand fallbackMethod handle!");
        return new ArrayList<>();
    }

}
