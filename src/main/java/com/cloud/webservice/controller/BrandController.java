package com.cloud.webservice.controller;

import com.cloud.webservice.controller.vo.DealerBrand;
import com.cloud.webservice.service.DealerBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanjinglin on 17/7/18.
 */
@RestController
public class BrandController {
    @Autowired
    DealerBrandService dealerBrandService;

    @RequestMapping(value="/brand")
    public List<DealerBrand> readUserInfo(){

        return dealerBrandService.searchAll();


    }
}
