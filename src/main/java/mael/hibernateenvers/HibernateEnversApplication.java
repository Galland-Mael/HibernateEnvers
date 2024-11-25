package mael.hibernateenvers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class HibernateEnversApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateEnversApplication.class, args);
    }

}
