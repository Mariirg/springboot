package com.ADSO.Project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ADSO.Project2.model.User;

public interface IUserRepository extends JpaRepository<User, Long> {

}
