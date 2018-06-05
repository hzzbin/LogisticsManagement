package com.fan.datasource;


import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
//@ConfigurationProperties(prefix = "datasource")
public class JdbcDataSource {
    @Value("${datasource.jdbc_url}")
    private String jdbcUrl;

    @Value("${datasource.username}")
    private String username;

    @Value("${datasource.password}")
    private String password;

    @Value("${datasource.maximum_pool_size}")
    private Integer maximumPoolSize;

    @Bean
    public DataSource dataSource() {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl(jdbcUrl);
        ds.setUsername(username);
        ds.setPassword(password);
        ds.setMaximumPoolSize(maximumPoolSize);
        ds.setMinimumIdle(5);
        ds.setConnectionTimeout(30000);
        ds.setMaxLifetime(20000);
        ds.setIdleTimeout(10000);
        ds.setLeakDetectionThreshold(10000);
        return ds;
    }

}
