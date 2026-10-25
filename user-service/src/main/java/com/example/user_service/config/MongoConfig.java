package com.example.user_service.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

import java.util.Arrays;

@Configuration
public class MongoConfig {
    private static final Logger log = LoggerFactory.getLogger(MongoConfig.class);

    @Bean
    public MongoClient mongoClient() {
        log.info("java-based configuration for mongoDB");
        return MongoClients.create("mongodb://admin:MarketPlace-01-hub@mongodb:27017/marketplace?authSource=admin");
    }

    @Bean
    public MongoDatabaseFactory mongoDatabaseFactory(
            MongoClient mongoClient) {
        return new SimpleMongoClientDatabaseFactory(
                mongoClient, "marketplace"
        );
    }

    @Bean
    public MongoTemplate mongoTemplate(
            MongoDatabaseFactory mongoDatabaseFactory) {
        return new MongoTemplate(mongoDatabaseFactory);
    }
    @Bean
    CommandLineRunner mongoDiagnostics(
            MongoClient mongoClient,
            MongoTemplate mongoTemplate,
            Environment environment) {

        return args -> {
            System.out.println("MongoClient default DB: "
                    + mongoClient.getDatabase("marketplace").getName());

            System.out.println("MongoTemplate DB: "
                    + mongoTemplate.getDb().getName());

            System.out.println("Active profiles: "
                    + Arrays.toString(environment.getActiveProfiles()));

            System.out.println("MongoDB URI property: "
                    + environment.getProperty("spring.data.mongodb.uri"));

            System.out.println("MongoDB database property: "
                    + environment.getProperty("spring.data.mongodb.database"));
        };
    }
}
