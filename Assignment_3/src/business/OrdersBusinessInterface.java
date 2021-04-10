/**
 * 
 */
package business;

import java.util.List;

import javax.ejb.Local;

import beans.Order;

/**
 * @author dustin johnson
 *
 */

@Local
public interface OrdersBusinessInterface {
	
	public void test();
	
	public List<Order> getOrders();
	
	public void setOrders(List<Order> orders);
	
}
