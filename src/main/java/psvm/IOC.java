package psvm;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Pet;

public class IOC {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
       Pet pet = context.getBean("myPet",Pet.class);
       pet.say();
       context.close();


    }
}
