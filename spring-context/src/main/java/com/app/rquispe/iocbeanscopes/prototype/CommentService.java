package com.app.rquispe.iocbeanscopes.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private ApplicationContext applicationContext;
//    @Autowired
//    private  CommentProcessor commentProcessor;

    /*
     * No inyectar el CommentProcessor directamente en el bean CommentService.
     * El bean CommentService es un singleton, lo que significa que Spring crea solo una instancia
     *  de esta clase. Como consecuencia, Spring también inyectará las dependencias de esta clase solo una vez
     *  cuando cree el propio bean CommentService. En este caso, terminará con solo una instancia de CommentProcessor
     */
    public void sendMessage(Comment comment) {
        CommentProcessor commentProcessor = applicationContext.getBean(CommentProcessor.class);
        System.out.println("CommentProcessor: "+ commentProcessor);
        commentProcessor.setComment(comment);
        commentProcessor.processComent();
        commentProcessor.validateComment();
    }

}
