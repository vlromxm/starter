package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {

    private String surname;
    private int age;

    private Pet pet;

//    @Autowired
//@Qualifier("catBean")
    public Person(Pet pet){
        System.out.println("Person bean is created");
        this.pet=pet;
    }

//    public Person (){
//        System.out.println("Person bean is created");
//    }
//    @Autowired
//    public void setPet(Pet pet){
//        System.out.println("Class person: set Pet");
//        this.pet=pet;
//    }

    public void callYourPet(){
        System.out.println("Hello, Pet");
        pet.say();
    }

    public void setAge(int age) {
        System.out.println("Class person: set age");
        this.age = age;
    }
    public void setSurname(String surname){
        System.out.println("Class person: set surname");
        this.surname=surname;
    }
    public int getAge(){
        return age;
    }

    public String getSurname() {
        return surname;
    }
}
