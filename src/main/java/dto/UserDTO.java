package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.Role;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	
	private String username;
	private String lastname;
	private String firstname;
	private String Country;
	private Role role;

}
