package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private ModelMapper mapper;

    @Override
    public boolean addCustomer(CustomerDTO dto) {
    if(customerRepo.existsById(dto.getNic())){
        throw new RuntimeException("Customer Already Exist");
    }
    customerRepo.save(mapper.map(dto, Customer.class));
    return true;
    }

    @Override
    public void deleteCustomer(String id) {

    }

    @Override
    public CustomerDTO searchCustomer(String id) {
        return null;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        return null;
    }

    @Override
    public void updateCustomer(CustomerDTO dto) {

    }
}
