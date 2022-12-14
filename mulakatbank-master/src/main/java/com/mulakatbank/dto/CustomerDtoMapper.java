package com.mulakatbank.dto;

import com.mulakatbank.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoMapper {

    public CustomerDto mapper(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setAddress(customer.getAddress());
        customerDto.setCity(CityDto.valueOf(customer.getCity().name()));
        customerDto.setName(customer.getName());
        customerDto.setDateOfBirth(customer.getDateOfBirth());

        return customerDto;
    }
}
