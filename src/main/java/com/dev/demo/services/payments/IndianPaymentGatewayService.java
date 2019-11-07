package com.dev.demo.services.payments;

import com.dev.demo.services.factory.IPaymentService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pankaj
 */
@Component
public class IndianPaymentGatewayService implements IPaymentService {

    @Override
    public List<String> getOption() {
        //For now its static, later we'll configure it in db
        List<String> gatewayList = new ArrayList<>();
        gatewayList.add("Paytm");
        return gatewayList;
    }
}
