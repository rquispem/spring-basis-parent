package com.app.rquispe.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
//2. Creamos la clase aspecto y lo marcamos como componente para agregarlo al contexto de spring
public class LoggingAspect {

    Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    /* 3. Definimos el metodo que implementa la logica del aspecto y usamos una anotacion que sera el advice
     * que le dira a spring cuando y que interceptar(Pointcut)
     *
     * execution: equivalente a decir cuando el metodo es llamado.
     * "*" : Significa que este metodo podria tener cualquier tipo de retorno
     * "com.app.rquispe.aop.CommentService": Significa que el metodo interceptado debe eestar en el paquete
     * "publishComment": significa que el metodo debe llamarse asi.
     * "..": Significa que el metodo interceptado puede tener cualquier parametros
     * */
    @Around("execution(* com.app.rquispe.aop.CommentService.publishComment(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        //4. Implementamos la logica del aspecto

        logger.info("Aspect:Before -  Method will execute");
        joinPoint.proceed(); //delega al metodo interceptado
        logger.info("Aspect:After - Method executed");
    }

    @Around("execution(* com.app.rquispe.aop.CommentService.publishCommentWithReturn(..))")
    public Object log2(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        final Object[] arguments = joinPoint.getArgs();
        logger.info("Aspect:Before - Method: " + methodName + " with parameters "
                        + Arrays.asList(arguments) +
                "will execure");
        final Object returnedByMethod = joinPoint.proceed();
        logger.info("Aspect:After - Publish Method executed");
        logger.info("Aspect:After - Publish Method executed and returned " + returnedByMethod);
        return returnedByMethod;
    }

    @Around("@annotation(ToLog)")
    public Object logAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Aspect @ToLog:Before -  Delete Method will execute");
        return joinPoint.proceed(joinPoint.getArgs());
    }

    @Before("execution(* com.app.rquispe.aop.CommentService.editComment(..))")
    public void logEditMethodBefore() {
        logger.info("Aspect:Before -  Edit Method will execute");
    }

    @After("execution(* com.app.rquispe.aop.CommentService.editComment(..))")
    public void logEditMethodAfter() {
        logger.info("Aspect:After -  Edit Method will execute");
    }
}
