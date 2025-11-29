package org.example.ss10.service;

import org.example.ss10.entity.Customer;
import org.example.ss10.repository.IViewlistRepository;
import org.example.ss10.repository.ViewlistRepository;

import java.util.List;

public class ViewlistService implements IViewlistService {

    private IViewlistRepository viewlistRepository = new ViewlistRepository();

    @Override
    public List<Customer> findAll() {
        return viewlistRepository.findAll();
    }
}
