package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectPointcutCombine {

    @Pointcut("execution(* aop.librarys.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* aop.librarys.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* aop.librarys.UniLibrary.add*())")
    private void allAddMethodsFromUniLibrary() {
    }

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing log#1 ");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice writing log#2 ");
    }

    @Before("allAddMethodsFromUniLibrary()")
    public void beforeAddLoggingAdvice() {
        System.out.println("beforeAddLoggingAdvice: writing log#3 ");
    }
}
