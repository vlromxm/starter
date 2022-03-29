package java_code_spring_container;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring_introduction.Cat;
import spring_introduction.Pet;

@Configuration
//@ComponentScan("spring_introduction")
public class MyConf {
    @Bean
    public Pet catBean(){
        return new Cat();
    }

}
