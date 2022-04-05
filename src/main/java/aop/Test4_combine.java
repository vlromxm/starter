package aop;

import aop.librarys.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4_combine {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.getMagazine();
        uniLibrary.addMagazine();
        uniLibrary.returnMagazine();

//        uniLibrary.getBook();
//        uniLibrary.addBook();
//        uniLibrary.returnBook();
    }
}
