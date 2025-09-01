package com.back;

import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Parser parser() {
        return Parser.builder().build();
    }

    @Bean
        public HtmlRenderer htmlRenderer(){
            return HtmlRenderer.builder().build();
        }
    }
