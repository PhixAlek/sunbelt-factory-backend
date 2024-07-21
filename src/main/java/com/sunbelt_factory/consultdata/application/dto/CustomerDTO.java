package com.sunbelt_factory.consultdata.application.dto;

/**
 * Data Transfer Object for customer information.
 */

public class CustomerDTO {

    private String firstName;
    private String middleName;
    private String lastName;
    private String secondLastName;
    private String phone;
    private String address;
    private String city;



// Constructor, getters, and setters

public CustomerDTO(String firstName, String middleName, String lastName, String secondLastName, String phone, String address, String city) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.secondLastName = secondLastName;
    this.phone = phone;
    this.address = address;
    this.city = city;
}

public String getFirstName() {
    return firstName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public String getMiddleName() {
    return middleName;
}

public void setMiddleName(String middleName) {
    this.middleName = middleName;
}

public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public String getSecondLastName() {
    return secondLastName;
}

public void setSecondLastName(String secondLastName) {
    this.secondLastName = secondLastName;
}

public String getPhone() {
    return phone;
}

public void setPhone(String phone) {
    this.phone = phone;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

public String getCity() {
    return city;
}

public void setCity(String city) {
    this.city = city;
}

@Override
public String toString() {
    return "CustomerDTO{" +
            "firstName='" + firstName + '\'' +
            ", middleName='" + middleName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", secondLastName='" + secondLastName + '\'' +
            ", phone='" + phone + '\'' +
            ", address='" + address + '\'' +
            ", city='" + city + '\'' +
            '}';
}
}
