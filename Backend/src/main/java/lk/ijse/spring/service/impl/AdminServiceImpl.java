package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.json.request.LoginRequestDTO;
import lk.ijse.spring.entity.Admin;
import lk.ijse.spring.exception.ApplicationException;
import lk.ijse.spring.repo.AdminRepo;
import lk.ijse.spring.service.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 9/26/21
 */

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepo adminRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public AdminDTO adminLogin(LoginRequestDTO loginRequestDTO) {

        Optional<Admin> adminOptional = adminRepo.findAdminByNameAndPassword(loginRequestDTO.getUsername(),
                loginRequestDTO.getPassword());
        if (adminOptional.isPresent()) {
            return mapper.map(adminOptional.get(), AdminDTO.class);
        }

        throw new ApplicationException("401", "Incorrect username or password");
    }
}
