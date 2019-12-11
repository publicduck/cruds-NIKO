package org.apache.struts.crud;

import org.apache.struts.crud.dao.MemoryPersonSupportDao;
import org.apache.struts.crud.dao.PersonRepository;
import org.apache.struts.crud.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    private PersonRepository manager;

    public HomeController(PersonRepository manager){
        this.manager = manager;
    }

    @GetMapping("/setup")
    void setup (){
        manager.insertPerson(new Person(1, "Bruce", "Phillips", "basketball", "male",
                MemoryPersonSupportDao.getCountry("US"), true, new String[]{"Ford", "Nissan"},
                "bphillips@ku.edu", "123-456-9999"));
        manager.insertPerson(new Person(2, "Antonio", "Sanchez", "mtb", "male",
                MemoryPersonSupportDao.getCountry("ES"), true, new String[]{"Toyota", "Seat"},
                "asanchez@correo-e.es", "555-999-8888"));
    }
}
