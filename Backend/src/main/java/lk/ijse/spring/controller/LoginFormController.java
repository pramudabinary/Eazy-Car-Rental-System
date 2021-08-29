package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/login")
@RestController
@CrossOrigin
public class LoginFormController {

    @PostMapping
    public boolean checkLogin(String email, String password) {
        CustomerDTO dto = new CustomerDTO();
        if ((dto.getEmail() == email) && (dto.getPassword() == password)) {
            return true;
        } else {
            return false;
        }
    }
}
