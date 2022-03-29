package psvm;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Dog;

public class SingletonPrototype {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet",Dog.class);
//        myDog.setName("Belka");
        Dog yourDog = context.getBean("myPet",Dog.class);
//        yourDog.setName("Strelka");

//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());

        System.out.println(myDog==yourDog);
        context.close();
    }
}
