package org.example;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOImpl implements PersonDAO {
    private List<Person> persons = new ArrayList<>();

    @Override
    public Person getPersonById(int id) {
        return persons.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Person> getAllPersons() {
        return persons;
    }

    @Override
    public void addPerson(Person person) {
        persons.add(person);
    }

    @Override
    public void updatePerson(Person person) {
        Person existingPerson = getPersonById(person.getId());
        if (existingPerson != null) {
            existingPerson.setName(person.getName());
            existingPerson.setContactInformation(person.getContactInformation());
            existingPerson.setAddress(person.getAddress());
        }
    }

    @Override
    public void deletePerson(int id) {
        persons.removeIf(p -> p.getId() == id);
    }
}
