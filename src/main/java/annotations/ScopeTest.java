package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Dog;
import spring_introduction.Person;

public class ScopeTest {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog dog = context.getBean("dog",Dog.class);
        Dog dog2 = context.getBean("dog",Dog.class);
        System.out.println(dog==dog2);
        System.out.println(dog);
        System.out.println(dog2);
        context.close();
//        Person person = context.getBean("personBean",Person.class);
//        person.callYourPet();
    }
}
