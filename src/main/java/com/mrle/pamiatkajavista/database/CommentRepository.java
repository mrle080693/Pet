package com.mrle.pamiatkajavista.database;

import com.mrle.pamiatkajavista.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    List<Comment> findAllByPageName(String pageName);
}
