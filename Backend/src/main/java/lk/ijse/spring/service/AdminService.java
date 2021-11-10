package lk.ijse.spring.service;


import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.json.request.LoginRequestDTO;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 9/26/21
 */
public interface AdminService {
    AdminDTO adminLogin(LoginRequestDTO loginRequestDTO);
}
