package com.example.demo.repository;

import com.example.demo.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DentistRepository extends JpaRepository<Dentist, Integer> {
    List<Dentist> findByDentistNameContaining(String name);
    List<Dentist> findByDentistName(String name);
}
