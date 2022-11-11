package com.app.rquispe.aop;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());
    public void publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
    }

    public String publishCommentWithReturn(Comment comment) {
        logger.info("Publishing comment with return: " + comment.getText());
        return "SUCESS";
    }

    @ToLog
    public void deleteComment(Comment comment) {
        logger.info("Deleting comment: "+ comment.getText());
    }

    public void editComment(Comment comment) {
        logger.info("Editing comment: "+ comment.getText());
    }
}
