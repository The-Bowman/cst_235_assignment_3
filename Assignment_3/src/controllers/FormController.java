package controllers;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.User;
import business.MyTimerService;
import business.OrdersBusinessInterface;


@ManagedBean
@ViewScoped
public class FormController {
	
	
	
	@Inject
	OrdersBusinessInterface service;
	
	@Inject
	MyTimerService timer;
	
	public OrdersBusinessInterface getService() {
		return service;
	}

	
	// called when the Submit button is clicked
	public String onSubmit(User user) {
		// start timer when login is clicked
		timer.setTimer(5000);
		
		// pushes user object data to the next page
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		service.test();
		
		// returns the next page
		return "Response.xhtml";
	}
	
}
