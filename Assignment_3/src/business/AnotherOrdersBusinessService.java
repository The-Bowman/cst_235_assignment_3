package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Order;


/**
 * Session Bean implementation class AnotherOrdersBusinessService
 */
@Stateless
@Local(OrdersBusinessInterface.class)
@LocalBean
@Alternative
public class AnotherOrdersBusinessService implements OrdersBusinessInterface {
	
	List<Order> orders = new ArrayList<Order>();

    /**
     * Default constructor. 
     */
    public AnotherOrdersBusinessService() {
        // TODO Auto-generated constructor stub
    	orders.add(new Order(1, "product 1", 1.11f, 5));
		orders.add(new Order(2, "product 2", 2.22f, 4));
		orders.add(new Order(3, "product 3", 3.33f, 3));
		orders.add(new Order(4, "product 4", 4.44f, 2));
		orders.add(new Order(5, "product 5", 5.55f, 1));
    }

	/**
     * @see OrdersBusinessInterface#test()
     */
    public void test() {
        // TODO Auto-generated method stub
    	System.out.println("Hello from AnotherOrdersBusinessService");
    	
    }
    
    public List<Order> getOrders(){
    	return orders;
    }
    
    public void setOrders(List<Order> orders) {
    	this.orders = orders;
    }

}
