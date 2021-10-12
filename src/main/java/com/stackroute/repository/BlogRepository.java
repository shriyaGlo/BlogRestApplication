package com.stackroute.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.domain.Blog;

/* Add annotation to declare this class as a Repository class.
This interface should extend CRUD Repository
* */

@Repository
public interface BlogRepository extends CrudRepository<Blog, Integer> {
}
