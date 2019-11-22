package com.iodia.eduodia.repository;

import java.io.Serializable;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.iodia.eduodia.model.Account;

public interface AccountRepository extends PagingAndSortingRepository<Account, Serializable>
{

}
