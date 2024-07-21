package com.sunbelt_factory.consultdata.aplication.service;

import com.sunbelt_factory.consultdata.aplication.dto.CustomerDTO;
import com.sunbelt_factory.consultdata.domain.exception.CustomerNotFoundException;
import com.sunbelt_factory.consultdata.domain.model.Customer;
import com.sunbelt_factory.consultdata.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public CustomerDTO getCustomer(String documentType, String documentNumber){
        Customer customer = customerRepository.findCustomerById(documentType, documentNumber);

        if(customer == null){
            throw new CustomerNotFoundException("Customer Not Found");
        }
        return new CustomerDTO(customer.getFirstName(), customer.getMiddleName(), customer.getLastName(), customer.getSecondLastName(), customer.getPhone(), customer.getAddress(), customer.getCity());
    }



}
