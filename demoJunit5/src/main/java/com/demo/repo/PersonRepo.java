package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {
	
	@Query("SELECT CASE WHEN COUNT(s)>0 THEN TRUE ELSE FALSE END FROM Person s WHERE s.personId=?1")
	Boolean isPersonExistsById(Integer id);

}
