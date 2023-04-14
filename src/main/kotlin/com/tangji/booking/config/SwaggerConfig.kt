package com.tangji.booking.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class SwaggerConfig {

    companion object {
        const val SWAGGER_SCAN_BASE_PACKAGE = "com.tangji";
    }

    @Bean
    fun api(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Tangji Booking")
                    .description("For Tangji")
                    .version("1.0.0")
            )
    }

}