package com.example.demo;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class routeClass 
{
	@Bean
	public RouteLocator getRoute(RouteLocatorBuilder builder)
	{
		return builder.routes()
				.route("Connect",
						//r->r.path("/web/**").uri("http://localhost:8082")
						r->r.path("/web/**").uri("lb://Connect-Service"))
						.build();
	}
}
