package com.amazonaws.lambda.demo;

import java.time.LocalDateTime;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<Object, String> {
	
	
    @Override
    public String handleRequest(Object input, Context context) {
        context.getLogger().log("Input: " + input);
        LocalDateTime date = LocalDateTime.now();
        String name = "Haeron"+input+date;
        return "HaeronSakthi@gmail.com!"+name;
    }
    
   

}
