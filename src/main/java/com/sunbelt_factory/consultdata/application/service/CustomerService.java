package com.sunbelt_factory.consultdata.application.service;

import com.sunbelt_factory.consultdata.domain.model.Customer;
import com.sunbelt_factory.consultdata.application.dto.CustomerDTO;

import com.sunbelt_factory.consultdata.domain.exception.CustomerNotFoundException;
import com.sunbelt_factory.consultdata.domain.exception.BadRequestException;

import com.sunbelt_factory.consultdata.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class CustomerService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerDTO getCustomer(String documentType, String documentNumber) {
        if (documentType == null || documentType.isEmpty() || documentNumber == null || documentNumber.isEmpty()) {
            logger.warn("Bad request: documentType or documentNumber is empty");
            throw new BadRequestException("Document type and document number must not be empty");
        }

        Customer customer = customerRepository.findCustomerById(documentType, documentNumber);

        if (customer == null) {
            logger.info("Customer not found: documentType={}, documentNumber={}", documentType, documentNumber);
            throw new CustomerNotFoundException("Customer Not Found");
        }

        logger.info("Customer found: {}", customer);
        return new CustomerDTO(
                customer.getFirstName(),
                customer.getMiddleName(),
                customer.getLastName(),
                customer.getSecondLastName(),
                customer.getPhone(),
                customer.getAddress(),
                customer.getCity()
        );
    }
}
