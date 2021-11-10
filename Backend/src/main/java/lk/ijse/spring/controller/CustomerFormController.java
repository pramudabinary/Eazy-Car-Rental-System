package lk.ijse.spring.controller;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.json.request.LoginRequestDTO;
import lk.ijse.spring.exception.NotFoundException;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerFormController {

    @Autowired
    private CustomerService service;


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveCustomer(@RequestBody CustomerDTO dto) {
        if (dto.getId().trim().length() <= 0) {
            throw new NotFoundException("Customer id Cannot be empty ");
        }
        service.addCustomer(dto);
        return new ResponseEntity(new StandardResponse("201", "Done", dto), HttpStatus.CREATED);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE,
            path = "/oauth/token")
    public ResponseEntity<StandardResponse> findAdminByNameAndPassword(@RequestBody LoginRequestDTO loginRequestDTO) {

        CustomerDTO customerDTO = service.customerLogin(loginRequestDTO);

        return new ResponseEntity<>(new StandardResponse("200", "Login Success", customerDTO),
                HttpStatus.OK);

    }

}
