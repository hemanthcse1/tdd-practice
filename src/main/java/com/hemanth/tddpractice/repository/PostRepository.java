package com.hemanth.tddpractice.repository;

import com.hemanth.tddpractice.Post;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends ListCrudRepository<Post,Integer> {
}
