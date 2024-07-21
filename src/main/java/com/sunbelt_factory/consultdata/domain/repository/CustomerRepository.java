package com.sunbelt_factory.consultdata.domain.repository;

import com.sunbelt_factory.consultdata.domain.model.Customer;

public interface CustomerRepository {
    Customer findCustomerById(String documentType, String documentNumber);
}
