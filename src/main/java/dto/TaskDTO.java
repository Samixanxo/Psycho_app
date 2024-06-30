package dto;

import java.time.LocalDate;

import lombok.Data;


@Data
public class TaskDTO {
    private String name;
    private String description;
    private LocalDate dueDate;
    private LocalDate creationDate;
    private boolean state;

    public TaskDTO(String name, String description, LocalDate dueDate, LocalDate creationDate, Boolean state) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.creationDate = creationDate;
        this.state = state;
    }

    // Getters and setters
}
