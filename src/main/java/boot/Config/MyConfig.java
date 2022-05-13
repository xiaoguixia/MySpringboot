package boot.Config;

import boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// proxyBeanMethods(true full模式 false lite模式)
public class MyConfig {

//   单实例
    @Bean("黄鑫")
    public User getUser()
    {
        return new User("hx",23);
    }

}
