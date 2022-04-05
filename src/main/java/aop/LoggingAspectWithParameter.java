package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectWithParameter {
    @Before("execution(public void getBook(Book))")
    public void beforeGetBookAdvice(){
        System.out.println("before getBookAdvice: we are trying to get book");
    }
}
