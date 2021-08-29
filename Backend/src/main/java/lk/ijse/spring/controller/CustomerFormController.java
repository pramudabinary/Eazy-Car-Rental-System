package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerFormController {
    @Autowired
    private CustomerService service;

    @PostMapping
    public String saveCustomer(@RequestBody CustomerDTO dto) {
        boolean b = service.addCustomer(dto);
        return b + "";

    }

    @GetMapping(path = "/login/")
    public CustomerDTO loginCustomer(@RequestBody CustomerDTO dto) {
        if (!dto.getEmail().equals("") && !dto.getPassword().equals("")) {
            CustomerDTO customer = service.findCustomerByEmailAndPassword(dto.getEmail(), dto.getPassword());
        }
        return null;
    }
}
