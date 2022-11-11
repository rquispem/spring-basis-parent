package com.app.rquispe.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring por debajo utiliza el patron proxy () para hacer uso de su magia
 * en funcionalidades como @Cacheable, @ Transactional, @Aspect, @Async, @Secured
 * Spring usa JDK Dynamic proxy o CGLIB(Code generation library) para generar proxy basodo
 * en la clase target. JDK Dinamyc proxy usa implementacion de interface para crear el proxy
 * mientras CGlib usa suclass de la clase target
 */
public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var service = context.getBean(CommentService.class);
        Comment c = new Comment();
        c.setAuthor("Ruben Quispe");
        c.setText("Texto del autor");
        service.publishComment(c);
        service.publishCommentWithReturn(c);
        service.editComment(c);
        service.deleteComment(c);
    }
}
