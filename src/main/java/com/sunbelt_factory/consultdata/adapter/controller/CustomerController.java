package com.sunbelt_factory.consultdata.adapter.controller;

import com.sunbelt_factory.consultdata.application.dto.CustomerDTO;
import com.sunbelt_factory.consultdata.application.service.CustomerService;
import com.sunbelt_factory.consultdata.domain.exception.CustomerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/find")
    public ResponseEntity<CustomerDTO> getCustomer(@RequestParam String documentType, @RequestParam String documentNumber) {
        try {
            CustomerDTO customer = customerService.getCustomer(documentType, documentNumber);
            return new ResponseEntity<>(customer, HttpStatus.OK);
        } catch (CustomerNotFoundException e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
