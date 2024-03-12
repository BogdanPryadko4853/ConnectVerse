package org.lconnectverse.services;

import lombok.RequiredArgsConstructor;
import org.lconnectverse.entity.Comment;
import org.lconnectverse.entity.Records.Comments;
import org.lconnectverse.repositories.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    //add new comment
    public void createComment(Comments comments) {
        Comment comment = new Comment();
        comment.setDescription(comments.getDescription());
        commentRepository.save(comment);
    }

    // delete comment
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }

    public void refactorComment(Long id, String description) {
        Optional<Comment> optionalComment = commentRepository.findById(id);

        if (optionalComment.isPresent()) {
            Comment comment = optionalComment.get();
            comment.setDescription(description);

            commentRepository.saveAndFlush(comment);
        } else {
            throw new IllegalArgumentException("Комментарий с id " + id + " не найден");
        }
    }

}
