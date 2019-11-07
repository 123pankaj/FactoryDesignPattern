package com.dev.demo.services.factory;

import com.dev.demo.services.payments.CanadaPaymentGatewayService;
import com.dev.demo.services.payments.ChinaPaymentGatewayService;
import com.dev.demo.services.payments.IndianPaymentGatewayService;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author pankaj
 */
@Configuration
public class PaymentServiceFactory {

    @Resource
    private IndianPaymentGatewayService indianPaymentGatewayService;

    @Resource
    private ChinaPaymentGatewayService chinaPaymentGatewayService;

    @Resource
    private CanadaPaymentGatewayService canadaPaymentGatewayService;


    public IPaymentService getInstance(String provider) {
        switch (provider.toUpperCase()) {
            case "INDIA":
                return indianPaymentGatewayService;
            case "CHINA":
                return chinaPaymentGatewayService;
            case "CANADA":
                return canadaPaymentGatewayService;
            default:
                return null;
        }
    }
}
