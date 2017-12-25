/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geekrealm.spring.cloud.service.a.controller;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DerekChia <jingqiang.jia@hand-china.com>
 */
@RestController
@RequestMapping("/api/service-a/demo/")
public class ServiceADemoController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    
    @RequestMapping(value = "getmethod", method = RequestMethod.GET)
    public Map getMethod(@RequestParam(value = "test", required = false) final String testParam) {
        logger.debug("service-a demo get method called!");
        
        Map result = new HashMap();
        
        if( testParam == null ) {
            result.put("response", "Hello world from service-a.");
        } else {
            result.put("response", "Hello world with param '" + testParam + "' from service-a.");
        }
        
        return result;
    }
    
    @RequestMapping(value = "postmethod", method = RequestMethod.POST)
    public void postMethod(@RequestBody(required = false) Map<String, String> postData) {
        if( postData != null && postData.keySet() != null && postData.keySet().size() > 0 ) {
            postData.entrySet().stream().forEach(entry -> logger.info(entry.getKey() + " : " + entry.getValue()));
        } else {
            logger.info("service-a deo post method called with empty request body.");
        }
    }
}
