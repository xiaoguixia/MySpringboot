package boot;

import boot.bean.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
//@EnableConfigurationProperties(Car.class) 可以不写@Component
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {

            System.out.println(name);
        }
        Object bean = run.getBean("黄鑫");



    }
}
