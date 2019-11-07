package com.dev.demo.services.factory;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author pankaj
 */
@Component
public interface IPaymentService {
    List<String> getOption();
}
