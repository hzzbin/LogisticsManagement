package com.fan.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.Formatter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Locale;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private BeanNameViewResolver beanNameViewResolver;


    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.viewResolver(beanNameViewResolver);
        registry.enableContentNegotiation(new MappingJackson2JsonView());
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatterForFieldType(Timestamp.class, new Formatter<Timestamp>() {
            @Override
            public String print(Timestamp object, Locale locale) {
                return String.valueOf(object.getTime());
            }

            @Override
            public Timestamp parse(String text, Locale locale) throws ParseException {
                return new Timestamp(Long.parseLong(text));
            }
        });
    }
}
