package com.bank.core.filter;

import java.io.IOException;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Order(0)
public class RequestResponseLoggingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		HttpServletRequest req= (HttpServletRequest) request;
		HttpServletResponse res= (HttpServletResponse) response;
	
		log.debug("Logging Request URI : {}  METHOD :{} ",req.getRequestURI(),req.getMethod());
		
		chain.doFilter(request, response);
		
		log.debug("Logging Response STATUS: {}  CONTENT TYPE: {} HEADERS : {}", res.getStatus(),res.getContentType(),res.getHeaderNames());
		
		
		
		
	}

}
