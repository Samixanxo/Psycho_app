package dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor 
public class TaskDTO {
    private Integer id;
    private String name;
    private String description;
    private LocalDate creationDate;
    private LocalDate dueDate;
    private Boolean state;
    private Integer userId;
    //private UserDTO user;
}
