package fr.formation.devoxx.domain.services;

import org.springframework.stereotype.Service;

import fr.formation.devoxx.domain.dto.CustomerDto;
import fr.formation.devoxx.domain.entities.Customer;
import fr.formation.devoxx.domain.repositories.CustomerJpaRepository;

@Service
public class CustomerServiceImp implements CustomerService {

    private final CustomerJpaRepository repo;

    public CustomerServiceImp(CustomerJpaRepository repo) {
	this.repo = repo;
    }

    @Override
    public void create(CustomerDto dto) {
	Customer customer = new Customer();
	customer.setFirstname(dto.getFirstname());
	customer.setLastname(dto.getLastname());
	customer.setPeriod(dto.getPeriod());
	repo.save(customer);
    }
}
