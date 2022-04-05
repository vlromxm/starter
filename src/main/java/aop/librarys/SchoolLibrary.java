package aop.librarys;

import aop.librarys.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("We get book from SchoolLibrary");
    }

}
