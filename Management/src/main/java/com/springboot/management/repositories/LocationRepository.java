package com.springboot.management.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.management.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
