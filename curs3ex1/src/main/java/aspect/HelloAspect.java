package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
public class HelloAspect {

    //@Before("execution(* service.HelloService.hello(..))")
    //public void doBefore() {
    //    System.out.println("Before hello");
    //}

    @Around("execution(* service.HelloService.hello(..))")
    public void doAround(ProceedingJoinPoint pjp) {
        try {
            System.out.println("Before");
            for (Object o : pjp.getArgs()) {
                System.out.println("Parameter: " + o);
            }
            Object o = pjp.proceed(new Object[]{"Mary"});
            System.out.println("After");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
