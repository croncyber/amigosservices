package com.amigoscode.customer;


import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer  = Customer.builder()
                .firstName("Jo")
                .lastName("Tusk")
                .email("jtusk@gmail.com")
                .build();

        customerRepository.save(customer);
    }
}
