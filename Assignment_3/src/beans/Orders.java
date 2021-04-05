package beans;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import java.util.ArrayList;

@ManagedBean
@ViewScoped
public class Orders {

	List<Order> orders = new ArrayList<Order>();

	/**
	 * Default Constructor w/ "dummy" data
	 */
	public Orders() {
		orders.add(new Order(1, "product 1", 22.22f, 2));
		orders.add(new Order(2, "product 2", 11.11f, 1));
		orders.add(new Order(3, "product 3", 44.44f, 3));
		orders.add(new Order(4, "product 4", 33.33f, 5));
		orders.add(new Order(5, "product 5", 78.90f, 1));
		
		
		
	}

	/**
	 * @return the orders
	 */
	public List<Order> getOrders() {
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
	
}
