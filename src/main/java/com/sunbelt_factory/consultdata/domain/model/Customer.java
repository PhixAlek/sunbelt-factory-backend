package com.sunbelt_factory.consultdata.domain.model;

public class Customer {

        private String firstName;
        private String middleName;
        private String lastName;
        private String secondLastName;
        private String phone;
        private String address;
        private String city;

        // Getters y Setters

        // Constructor
        public Customer(String firstName, String middleName, String lastName, String secondLastName, String phone, String address, String city) {
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.secondLastName = secondLastName;
            this.phone = phone;
            this.address = address;
            this.city = city;
        }
    

}
