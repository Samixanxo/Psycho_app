package dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTaskDTO {
	 private Integer id;
	    private String name;
	    private String description;
	    private LocalDate creationDate;
	    private LocalDate dueDate;
	    private Boolean state;
}
