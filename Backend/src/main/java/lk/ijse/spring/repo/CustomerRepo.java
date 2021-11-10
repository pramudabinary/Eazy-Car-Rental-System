package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Admin;
import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 9/26/21
 */

public interface CustomerRepo extends JpaRepository<Customer,String> {
    Optional<Customer> findCustomerByNameAndPassword(String name, String password);
}
