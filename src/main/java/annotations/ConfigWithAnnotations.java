package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Cat;
import spring_introduction.Person;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean",Person.class);
        person.callYourPet();

//
//        System.out.println(person.getSurname());
//        System.out.println(person.getAge());

//        Cat cat = context.getBean("catBean",Cat.class);
//        cat.say();
        context.close();
    }
}
