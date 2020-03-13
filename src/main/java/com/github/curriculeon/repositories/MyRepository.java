package com.github.curriculeon.repositories;

import com.github.curriculeon.models.MyModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends CrudRepository<MyModel, Long> {
}
