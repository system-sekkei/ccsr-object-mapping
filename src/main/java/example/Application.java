package example;

import com.fasterxml.jackson.databind.ObjectMapper;
import example.infrastructure._configuration.CustomObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ObjectMapper customObjectMapper() {
        return CustomObjectMapper.create();
    }

}
