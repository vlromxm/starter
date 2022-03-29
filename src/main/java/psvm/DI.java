package psvm;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Person;

public class DI {
    public static void main(String[] args) {
//        Pet pet = new Cat();

        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet",Pet.class);
//        Person person = new Person(pet);
//        person.callYourPet();
//        context.close();

        var person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getAge());
        System.out.println(person.getSurname());
        context.close();
    }
}
