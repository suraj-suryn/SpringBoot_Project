package com.springboot.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.management.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
