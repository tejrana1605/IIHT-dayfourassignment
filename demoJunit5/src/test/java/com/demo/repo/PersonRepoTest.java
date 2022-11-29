package com.demo.repo;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.demo.model.Person;

@SpringBootTest
public class PersonRepoTest {

	private  PersonRepo personRepo;
	@Test
	void isPersonExitsById() {
		Person person=new Person(14,"santosh");
		personRepo.save(person);
		
		Boolean acRes=personRepo.isPersonExistsById(14);
		assertThat(acRes).isTrue();
	}
	@BeforeEach
	void setUp(){
		System.out.println(" setup is started");
	}
	@AfterEach
	void tearDown() {
		System.out.println(" Test Over");
		personRepo.deleteAll();
	}
}
