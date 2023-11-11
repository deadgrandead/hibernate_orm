package com.deadgrandead.hibernate_orm.repository;

import com.deadgrandead.hibernate_orm.entity.Person;
import com.deadgrandead.hibernate_orm.entity.PersonId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonRepository extends JpaRepository<Person, PersonId> {
    List<Person> findByCityOfLiving(String city);
}