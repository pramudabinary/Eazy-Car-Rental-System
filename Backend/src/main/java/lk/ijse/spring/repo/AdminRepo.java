package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 9/26/21
 */
public interface AdminRepo extends JpaRepository<Admin, String> {
    Optional<Admin> findAdminByNameAndPassword(String name, String password);
}