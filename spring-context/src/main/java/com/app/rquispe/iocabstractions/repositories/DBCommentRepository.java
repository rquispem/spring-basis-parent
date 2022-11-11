package com.app.rquispe.iocabstractions.repositories;


import com.app.rquispe.iocabstractions.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository {

  @Override
  public void storeComment(Comment comment) {
    System.out.println("Storing comment: " + comment.getText());
  }
}
