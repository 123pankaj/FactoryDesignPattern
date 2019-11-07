package com.dev.demo.controllers;

import com.dev.demo.services.factory.PaymentServiceFactory;
import com.dev.demo.utils.AppConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author pankaj
 */
@RestController
@RequestMapping(value = AppConstants.BASE_URL)
public class Payments {

    @Resource
    private PaymentServiceFactory paymentServiceFactory;

    /* i am taking country from user app
    *  i can do the same via IP as well, from the IP we can get country.
    * */

    @GetMapping(path = AppConstants.GET_PAYMENT_OPTIONS, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getPaymentOptions(@PathVariable("countryName") String countryName) {
        List<String> result = paymentServiceFactory.getInstance(countryName).getOption();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
