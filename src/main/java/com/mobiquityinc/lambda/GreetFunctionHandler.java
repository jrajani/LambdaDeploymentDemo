package com.mobiquityinc.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by jayrajani on 09/04/2018.
 */
public class GreetFunctionHandler implements RequestHandler<Map<String,String>,String> {

    private static final Logger LOGGER = Logger.getLogger(GreetFunctionHandler.class.getName());

    public String handleRequest(Map <String,String> values, Context context) {

        LOGGER.info("Handling request");

        return "Hello World !!";
    }

}

