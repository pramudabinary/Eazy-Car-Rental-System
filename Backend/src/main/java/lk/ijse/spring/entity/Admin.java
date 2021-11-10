package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 9/19/21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Admin {
    @Id
    private String id;
    private String name;
    private String address;
    private String contact;
    private String password;
}
