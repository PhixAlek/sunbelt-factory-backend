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
        public String getFirstName() {
            return firstName;
        }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }
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
