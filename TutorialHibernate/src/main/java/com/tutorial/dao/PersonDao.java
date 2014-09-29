package com.tutorial.dao;

import com.tutorial.dao.GenericDao;
import java.util.List;
import com.tutorial.model.Person;

public interface PersonDao extends GenericDao<Person, Long> {
    public List<Person> findByLastName(String lastName);
}