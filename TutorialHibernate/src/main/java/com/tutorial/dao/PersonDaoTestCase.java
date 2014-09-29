package com.tutorial.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tutorial.model.Person;

public class PersonDaoTestCase extends BaseDaoTestCase {

	@Autowired
	private PersonDao personDao;
	
	@Test
	public void testFindPersonByLastName() throws Exception {
	    List<Person> people = personDao.findByLastName("Raible");
	    assertTrue(people.size() > 0);
	}
}
