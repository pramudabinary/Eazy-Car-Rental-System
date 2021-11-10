package lk.ijse.spring.service;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.json.request.LoginRequestDTO;
import lk.ijse.spring.entity.Customer;


import java.util.ArrayList;
import java.util.Optional;


public interface CustomerService {
    void addCustomer(CustomerDTO dto);

    void deleteCustomer(String id);

    CustomerDTO searchCustomer(String id);

    ArrayList<CustomerDTO> getAllCustomers();

    void updateCustomer(CustomerDTO dto);

    CustomerDTO customerLogin(LoginRequestDTO loginRequestDTO);


}
