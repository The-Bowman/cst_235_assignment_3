package beans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.*;

@ManagedBean
@ViewScoped

public class User {
	
	@NotNull()
	@Size(min=5, max=15) 
	private String firstName;
	@NotNull()
	@Size(min=5, max=15)
	private String lastName;
	

	// default constructor
	public User() {
		this.firstName = "Dustin";
		this.lastName = "Johnson";
	}

	// return first name
	public String getFirstName() {
		return firstName;
	}

	// return last name
	public String getLastName() {
		return lastName;
	}
	
	// set firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// set lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	

}
