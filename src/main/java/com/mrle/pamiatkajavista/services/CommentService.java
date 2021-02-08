package com.mrle.pamiatkajavista.services;

import com.mrle.pamiatkajavista.database.CommentRepository;
import com.mrle.pamiatkajavista.models.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> findAllByPageName(String pageName) {
        return commentRepository.findAllByPageName(pageName);
    }

    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }
}
