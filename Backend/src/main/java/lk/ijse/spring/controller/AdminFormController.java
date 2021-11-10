package lk.ijse.spring.controller;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.json.request.LoginRequestDTO;
import lk.ijse.spring.service.AdminService;
import lk.ijse.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 9/19/21
 */
@RestController
@RequestMapping("api/v1/admin")
@CrossOrigin
public class AdminFormController {

    @Autowired
    private AdminService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE,
            path = "/oauth/token")
    public ResponseEntity<StandardResponse> findAdminByNameAndPassword(@RequestBody LoginRequestDTO loginRequestDTO) {

        AdminDTO adminDTO = service.adminLogin(loginRequestDTO);

        return new ResponseEntity<>(new StandardResponse("200", "Login Success", adminDTO),
                HttpStatus.OK);

    }
}