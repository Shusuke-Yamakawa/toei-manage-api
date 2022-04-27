package com.toei.manage.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
@EnableWebMvc
class WebMvcConfig : WebMvcConfigurer {
    // CORS設定
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**").allowedOrigins("http://localhost:3000")
    }

    // 当プロジェクトのHTTPログ出力設定
//    @Bean
//    fun requestLoggingFilter(): RequestLoggingFilter {
//        val loggingFilter = RequestLoggingFilter()
//        loggingFilter.setIncludeQueryString(true)
//        loggingFilter.setIncludePayload(true)
//        loggingFilter.setMaxPayloadLength(4096)
//        return loggingFilter
//    }
}