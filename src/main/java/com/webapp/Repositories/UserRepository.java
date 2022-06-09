package com.webapp.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.webapp.Entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}