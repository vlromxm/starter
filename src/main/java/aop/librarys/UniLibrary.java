package aop.librarys;

import aop.librarys.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("We get book from UniLibrary");
    }

    public void getMagazine() {
        System.out.println("We get magazine from UniLibrary");
    }

    public void returnBook() {
        System.out.println("We return book");
    }

    public void returnMagazine() {
        System.out.println("We return magazine");
    }

    public void addBook() {
        System.out.println("We add book to UniLibrary");
    }

    public void addMagazine() {
        System.out.println("We add magazine to UniLibrary");
    }


}
