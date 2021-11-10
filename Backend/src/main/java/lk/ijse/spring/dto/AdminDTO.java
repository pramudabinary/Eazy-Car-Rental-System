package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 9/19/21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDTO {
    private String id;
    private String name;
    private String address;
    private String contact;
    private String password;
}