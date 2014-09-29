package com.tutorial.dao.hibernate;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import com.tutorial.dao.PersonDao;
import com.tutorial.model.Person;

public class PersonDaoHibernate extends GenericDaoHibernate<Person, Long> implements
PersonDao {
	
	public PersonDaoHibernate() {
		super(Person.class);
	}
	
	public List<Person> finByLastName(String lastName) {
		return getSession().createCriteria(Person.class).add(Restrictions.eq("lastName",
				lastName)).list();
	}

	@Override
	public List<Person> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
