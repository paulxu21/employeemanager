package com.xhp.employee.service;

import com.xhp.employee.dao.PersonDAO;
import com.xhp.employee.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xuhaipeng on 2016/12/16.
 *
 */

@Service
public class PersonService {

    @Autowired private PersonDAO personDAO;

    public List<Person> getPersons(){
        return null;
    }

    public Person getPersonById(String id){
        return null;
    }

    public void addPerson(Person person){

    }

    public void updatePerson(Person person){

    }

    public void deletePersonById(String Id){

    }
}
