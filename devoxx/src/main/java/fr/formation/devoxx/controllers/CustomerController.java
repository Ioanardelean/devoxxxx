package fr.formation.devoxx.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.devoxx.domain.dto.CustomerDto;
import fr.formation.devoxx.domain.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
	this.service = service;
    }

    @PostMapping
    protected void create(@Valid @RequestBody CustomerDto customer) {
	service.create(customer);
    }
}
