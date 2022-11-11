package com.app.rquispe.iocbeanscopes.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * En este escenario CommentProcessor necesita acceder al bean CommentRepository, la manera sencilla
 * para esto es a traves de DI, pero para esto spring necesita conocer a CommentProcessor() debe ser un bean
 */
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {
    private final CommentRepository commentRepository;
    private Comment comment;

    @Autowired
    public CommentProcessor(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void processComent() {
        System.out.println("procesando comment");
    }

    public void validateComment() {
        System.out.println("validando comment");
    }
}
