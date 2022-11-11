package com.app.rquispe.iocabstractions.services;

import com.app.rquispe.iocabstractions.Comment;
import com.app.rquispe.iocabstractions.proxies.CommentNotificationProxy;
import com.app.rquispe.iocabstractions.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
  private final CommentRepository commentRepository;
  private final CommentNotificationProxy commentNotificationProxy;

  @Autowired
  public CommentService(CommentRepository commentRepository,
                        @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
    this.commentRepository = commentRepository;
    this.commentNotificationProxy = commentNotificationProxy;
  }

  public void publishComment(Comment comment) {
    commentRepository.storeComment(comment);
    commentNotificationProxy.sendComment(comment);
  }
}
