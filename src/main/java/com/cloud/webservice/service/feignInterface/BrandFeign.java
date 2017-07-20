package com.cloud.webservice.service.feignInterface;

import com.cloud.webservice.controller.vo.DealerBrand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by yuanjinglin on 17/7/19.
 */
@FeignClient(name="spring-boot-mybatis-demo")
public interface BrandFeign {
    @RequestMapping(value = "/dealerBrand/queryAll",method = RequestMethod.GET)
    List<DealerBrand> queryAll();
}
