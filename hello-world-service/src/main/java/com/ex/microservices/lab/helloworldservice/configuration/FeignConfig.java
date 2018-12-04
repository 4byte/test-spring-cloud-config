package com.ex.microservices.lab.helloworldservice.configuration;

import feign.Client;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.cloud.openfeign.ribbon.CachingSpringLoadBalancerFactory;
import org.springframework.cloud.openfeign.ribbon.LoadBalancerFeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

	@Bean
	public Client feignClient(CachingSpringLoadBalancerFactory cachingLBClientFactory,
							  SpringClientFactory clientFactory) {
		return new LoadBalancerFeignClient(new Client.Default(null,null), cachingLBClientFactory, clientFactory);
	}

}
