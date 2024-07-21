package com.sunbelt_factory.consultdata.adapter.controller.repository;

import com.sunbelt_factory.consultdata.domain.model.Customer;
import com.sunbelt_factory.consultdata.domain.repository.CustomerRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCustomerRepository implements CustomerRepository {

    private static final Map<String, Customer> customers = new HashMap<>();

    static {
        customers.put("C10121314", new Customer("Juan", "Carlos", "Pérez", "García", "1234567890", "Calle 123", "Bogotá"));
    }

    @Override
    public Customer findCustomerById(String documentType, String documentNumber){
        return customers.get(documentType + documentNumber);
    }

}
