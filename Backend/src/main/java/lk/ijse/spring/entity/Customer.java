package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    private String id;
    private String name;
    private String address;
    private String email;
    private String password;
    private String nic;
    private String contact;
    private String license;
}
