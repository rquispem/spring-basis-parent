package com.app.rquispe.iocabstractions;

import com.app.rquispe.iocabstractions.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

    var comment = new Comment();
    comment.setAuthor("Ruben Quispe");
    comment.setText("Demo Comment");

    var commentService = context.getBean(CommentService.class);
    commentService.publishComment(comment);
  }
}
