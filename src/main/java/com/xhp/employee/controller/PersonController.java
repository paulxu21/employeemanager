package com.xhp.employee.controller;

import com.xhp.employee.entities.Person;
import com.xhp.employee.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by xuhaipeng on 2016/12/16.
 */
@Controller
public class PersonController {

    @Autowired private PersonService personService;

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
