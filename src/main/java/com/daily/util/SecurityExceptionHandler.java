package com.daily.util;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

public class SecurityExceptionHandler extends SimpleUrlAuthenticationFailureHandler{
    private Map<String, Integer> failureStatusCodesMap = new HashMap<String, Integer>();
    
	 public Map<String, Integer> getFailureStatusCodesMap() {
		return failureStatusCodesMap;
	}

	@Override
	    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
	            AuthenticationException exception) throws IOException, ServletException {
	        Integer statusCode = failureStatusCodesMap.get(exception.getClass().getName());
	        if (statusCode != null) {
	        	response.sendError(statusCode, "Authentication Failed: " + exception.getMessage());
	        } else {
	            super.onAuthenticationFailure(request, response, exception);
	        }
	}
}
