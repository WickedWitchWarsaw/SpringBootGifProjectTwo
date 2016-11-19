package pl.akademiakodu.giflib.config.dev;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


import javax.sql.DataSource;

/**
 * Created by ZuZ on 2016-11-19.
 */
@Configuration
@PropertySource("dev.properties")
public class DevDataSourceConfig {

    private Logger logger = LoggerFactory.getLogger(DevDataSourceConfig.class);

    @Autowired
    private Environment environment;

    @Bean
    public DataSource dataSource(){
        logger.info(environment.getProperty("giflib.db.log"));
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(environment.getProperty("giflib.db.Driver"));
        basicDataSource.setUrl(environment.getProperty("giflib.db.url"));
        basicDataSource.setUsername(environment.getProperty("giflib.db.username"));
        basicDataSource.setPassword(environment.getProperty("giflib.db.password"));
        return basicDataSource;
    }

}
