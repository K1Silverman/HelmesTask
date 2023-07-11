package com.example.helmestask;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SpringBootApplication
public class HelmesTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelmesTaskApplication.class, args);
	}

	@Component
	public class FirstFilter extends OncePerRequestFilter {

		@Override
		protected void doFilterInternal(HttpServletRequest httpServletRequest,
				HttpServletResponse httpServletResponse,
				FilterChain filterChain)
				throws ServletException, IOException {
			httpServletResponse.addHeader("Access-Control-Allow-Origin", "*");
			filterChain.doFilter(httpServletRequest, httpServletResponse);
		}
	}
}
