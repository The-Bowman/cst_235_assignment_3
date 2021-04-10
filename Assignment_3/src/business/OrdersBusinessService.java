package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Order;
import beans.Orders;

/**
 * Session Bean implementation class OrdersBusinessService
 */
@Stateless
@Local(OrdersBusinessInterface.class)
@LocalBean
@Alternative
public class OrdersBusinessService implements OrdersBusinessInterface {
	
	List<Order> orders = new ArrayList<Order>();

    /**
     * Default constructor. 
     */
    public OrdersBusinessService() {
        // TODO Auto-generated constructor stub
    	orders.add(new Order(1, "product 1", 22.22f, 2));
		orders.add(new Order(2, "product 2", 11.11f, 1));
		orders.add(new Order(3, "product 3", 44.44f, 3));
		orders.add(new Order(4, "product 4", 33.33f, 5));
		orders.add(new Order(5, "product 5", 78.90f, 1));
    }

	/**
     * @see OrdersBusinessInterface#test()
     */
    public void test() {
        // TODO Auto-generated method stub
    	System.out.println("Hello from the OrdersBusinessService class");
    }
    
    public List<Order> getOrders(){
    	return orders;
    }
    
    public void setOrders(List<Order> orders) {
    	this.orders = orders;
    }

}
