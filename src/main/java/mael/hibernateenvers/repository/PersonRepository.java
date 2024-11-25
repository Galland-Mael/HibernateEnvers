package mael.hibernateenvers.repository;

import mael.hibernateenvers.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
