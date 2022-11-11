package com.app.rquispe.iocabstractions.repositories;

import com.app.rquispe.iocabstractions.Comment;

public interface CommentRepository {
  void storeComment(Comment comment);
}
