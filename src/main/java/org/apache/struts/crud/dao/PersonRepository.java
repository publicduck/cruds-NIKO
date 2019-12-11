package org.apache.struts.crud.dao;

import org.apache.struts.crud.model.Country;
import org.apache.struts.crud.model.Person;
import org.apache.struts.crud.service.PersonService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

@Repository
public class PersonRepository implements PersonService {

    @PersistenceContext
    EntityManager manager;


    @Override
    public Person getPerson(Integer id) {
        return manager.find(Person.class, id );
    }

    @Override
    public Person[] getAllPersons() {
        return new Person[0];
    }

    @Override
    public void updatePerson(Person personBean) {

    }

    @Override
    @Transactional
    public void insertPerson(Person personBean) {
        manager.persist(personBean);
    }

    @Override
    public void deletePerson(Integer id) {

    }

    @Override
    public Country[] getCountries() {
        return new Country[0];
    }

    @Override
    public String[] getCarModels() {
        return new String[0];
    }

    @Override
    public String[] getSports() {
        return new String[0];
    }

    @Override
    public String[] getGenders() {
        return new String[0];
    }
}
