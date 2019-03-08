package fr.formation.devoxx.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.devoxx.domain.entities.Customer;

public interface CustomerJpaRepository extends JpaRepository<Customer, Long> {
}
