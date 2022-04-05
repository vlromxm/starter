package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectNoParameter {

//    @Before("execution(public void get* ())")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: trying to get a book");
//    }
//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBook: we trying ro return book");
//    }
}
