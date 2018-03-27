package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Mitet0 on 3/27/2018
 */
@SpringBootApplication(scanBasePackages = {"calculator","dataConverter", "jsonformatter", "translator"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
