package aop.librarys;

import aop.Book;
import org.springframework.stereotype.Component;

@Component
public class UniLibraryParameter {
    public void getBook(Book book){
        System.out.println("We get book "+book.getName());
    }
}
