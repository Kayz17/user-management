package com.dstech.usermanagement.repository;

import com.dstech.usermanagement.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}