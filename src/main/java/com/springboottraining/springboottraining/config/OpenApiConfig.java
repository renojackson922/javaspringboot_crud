package com.springboottraining.springboottraining.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * OpenAPI 문서 설정
 *
 * @author lattepapa
 * @date 2021-02-24
 * */
@OpenAPIDefinition(
        info = @Info(title = "Sample API 명세서",
                description = "Sample API 명세서",
                version = "v1",
                contact = @Contact(name = "test", email = "test@gmail.com"),
                license = @License(name = "test 1.0",
                        url = "https://www.google.com")
        )
)
@Configuration
public class OpenApiConfig {
    /**
     * API 문서의 관리자 그룹을 설정합니다.
     *
     * @return
     * */
    @Bean
    public GroupedOpenApi managerGroup() {
        String[] paths = {"/api/v1/**"};
        return GroupedOpenApi.builder().group("01. Manager").pathsToMatch(paths).build();
    }

    /**
     * API 문서의 사용자 그룹을 설정합니다.
     *
     * @return
     * */
    @Bean
    public GroupedOpenApi userGroup() {
        return GroupedOpenApi.builder().group("02. User").pathsToMatch("/api/v1/**").build();
    }
}
