package com.app.rquispe.iocbeanscopes.prototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        CommentService commentService = context.getBean(CommentService.class);
        System.out.println("CommentService: " + commentService);
        Comment c = new Comment();
        c.setMessage("Mensaje");
        commentService.sendMessage(c);

        CommentService commentService2 = context.getBean(CommentService.class);
        System.out.println("CommentService2: " + commentService2);
        commentService2.sendMessage(c);
    }
}
