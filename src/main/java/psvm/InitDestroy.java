package psvm;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Dog;

public class InitDestroy {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();
        context.close();
    }
}
