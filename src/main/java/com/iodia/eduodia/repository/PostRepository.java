package com.iodia.eduodia.repository;

import java.io.Serializable;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.iodia.eduodia.model.post.Post;

public interface PostRepository extends PagingAndSortingRepository<Post, Serializable>
{

}
