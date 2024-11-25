package mael.hibernateenvers.service;

import mael.hibernateenvers.model.Person;
import mael.hibernateenvers.repository.PersonRepository;
import org.springframework.stereotype.Service;


@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(
            PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person create(Person person) {
        return personRepository.save(person);
    }

    public Person update(Long id, Person person) {
        Person personToUpdate = personRepository.findById(id).orElseThrow(() -> new RuntimeException("Person not found"));
        personToUpdate.setName(person.getName());
        personToUpdate.setAge(person.getAge());
        return personRepository.save(personToUpdate);
    }

    public void delete(Long id) {
        personRepository.deleteById(id);
    }
}
