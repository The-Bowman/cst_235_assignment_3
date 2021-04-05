package controllers;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import beans.User;


@ManagedBean
@ViewScoped
public class FormController {

	
	// called when the Submit button is clicked
	public String onSubmit(User user) {
		
		// pushes user object data to the next page
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		// returns the next page
		return "Response.xhtml";
	}
	
}
