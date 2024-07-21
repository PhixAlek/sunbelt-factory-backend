package com.sunbelt_factory.consult_data.domain.repository;

import com.sunbelt_factory.consult_data.domain.model.Customer;

public interface CustomerRepository {
    Customer findCustomerById(String documentType, String documentNumber);
}
