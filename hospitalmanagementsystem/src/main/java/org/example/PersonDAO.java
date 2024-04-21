package org.example;

import java.util.List;

public interface PersonDAO {
    Person getPersonById(int id);
    List<Person> getAllPersons();
    void addPerson(Person person);
    void updatePerson(Person person);
    void deletePerson(int id);
}

