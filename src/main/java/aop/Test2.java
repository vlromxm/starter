package aop;

import aop.librarys.UniLibraryParameter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibraryParameter uniLibraryParameter =
                context.getBean("uniLibraryParameter", UniLibraryParameter.class);
        Book book = context.getBean("book",Book.class);
        uniLibraryParameter.getBook(book);
        context.close();

    }
}
