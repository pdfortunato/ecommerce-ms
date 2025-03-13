package com.ecommerce.apigateway.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user-service", r -> r.path("/users/**")
                        .uri("https://33915c38-2f9e-45da-8145-d6f9de2fee81.mock.pstmn.io/"))
                .route("catalog-service", r -> r.path("/catalog/**")
                        .uri("https://33915c38-2f9e-45da-8145-d6f9de2fee81.mock.pstmn.io/"))
                .build();
    }
}
