package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.json.request.LoginRequestDTO;
import lk.ijse.spring.entity.Admin;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.exception.ApplicationException;
import lk.ijse.spring.exception.ValidateException;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void addCustomer(CustomerDTO dto) {
        if (customerRepo.existsById(dto.getId())) {
            throw new ValidateException("Customer Already Exist");
        }
        customerRepo.save(mapper.map(dto, Customer.class));
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

    @Override
    public CustomerDTO customerLogin(LoginRequestDTO loginRequestDTO) {
        Optional<Customer> customerOptional = customerRepo.findCustomerByNameAndPassword(loginRequestDTO.getUsername(),
                loginRequestDTO.getPassword());
        if (customerOptional.isPresent()) {
            return mapper.map(customerOptional.get(), CustomerDTO.class);
        }

        throw new ApplicationException("401", "Incorrect username or password");
    }
}
