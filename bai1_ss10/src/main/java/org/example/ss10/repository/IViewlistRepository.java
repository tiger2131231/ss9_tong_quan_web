package org.example.ss10.repository;

import org.example.ss10.entity.Customer;
import java.util.List;

public interface IViewlistRepository {
    List<Customer> findAll();
}
