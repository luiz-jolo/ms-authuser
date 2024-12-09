package com.ead.authuser.configs;

import net.kaczmarzyk.spring.data.jpa.web.SpecificationArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class ResolverConfig implements WebMvcConfigurer {

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers){
        argumentResolvers.add(new SpecificationArgumentResolver());
        var resolver = new PageableHandlerMethodArgumentResolver();
        resolver.setFallbackPageable(PageRequest.of(0, 10));
        argumentResolvers.add(resolver);
    }

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry){
//        corsRegistry.addMapping("/users/**").allowedOrigins("http://example.com");
//        corsRegistry.addMapping("/auth/**").allowedOrigins("http://example.com");
        corsRegistry.addMapping("/**");
    }
}
