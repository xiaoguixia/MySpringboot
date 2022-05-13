package boot.controller;

import boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private Car car;

    @RequestMapping("/hello")
    public String start()
    {
        return "hello,Spring Boot";
    }

    @RequestMapping("/car")
    public Car toCar()
    {
        return car;
    }
}


