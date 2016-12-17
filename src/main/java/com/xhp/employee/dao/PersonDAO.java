package com.xhp.employee.dao;

import com.xhp.employee.entities.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xuhaipeng on 2016/12/16.
 */


@Repository
public class PersonDAO {

    @Resource private SessionFactory sessionFactory;

    @SuppressWarnings("unused")
    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    @SuppressWarnings("unchecked")
    public List<Person> getPersons(){
        return (List<Person>) this.getSession().createCriteria(Person.class).list();
    }

    public Person getPersonById(String id){
        return null;
    }

    public void addPerson(Person person){
        this.getSession().save(person);
    }

    public void updatePerson(Person person){
        this.getSession().update(person);
    }

    public void deletePersonById(String Id){

    }
}
