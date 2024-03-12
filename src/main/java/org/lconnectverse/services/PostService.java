package org.lconnectverse.services;

import lombok.RequiredArgsConstructor;
import org.lconnectverse.entity.Post;
import org.lconnectverse.entity.Records.Posts;
import org.lconnectverse.repositories.PostRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository  postRepository;


    //create post
    public void createPost(Posts posts) {
        Post post = new Post();
        post.setTitle(posts.getTitle());
        post.setDescription(posts.getDescription());
        postRepository.save(post);
    }
}
