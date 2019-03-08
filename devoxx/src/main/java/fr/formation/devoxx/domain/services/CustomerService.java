package fr.formation.devoxx.domain.services;

import javax.validation.Valid;

import fr.formation.devoxx.domain.dto.CustomerDto;

public interface CustomerService {

    public void create(@Valid CustomerDto customer);
}
