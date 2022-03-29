package java_code_spring_container;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_introduction.Person;
import spring_introduction.Pet;

public class Test {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(MyConf.class);
//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();
        Pet cat = context.getBean("catBean",Pet.class);
        cat.say();
        context.close();
    }
}
