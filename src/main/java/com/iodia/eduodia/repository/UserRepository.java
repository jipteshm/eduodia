package com.iodia.eduodia.repository;

import java.io.Serializable;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.iodia.eduodia.model.User;

public interface UserRepository extends PagingAndSortingRepository<User, Serializable>
{

}
