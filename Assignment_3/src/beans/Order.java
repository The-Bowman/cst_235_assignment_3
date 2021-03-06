package beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Order")
public class Order {

	private int orderNumber = 0;
	private String productName = "";
	private float price = 0;
	private int qty = 0;
	
	/**
	 * @param orderNumber
	 * @param productName
	 * @param price
	 * @param qty
	 */
	public Order(int orderNumber, String productName, float price, int qty) {
		super();
		this.orderNumber = orderNumber;
		this.productName = productName;
		this.price = price;
		this.qty = qty;
	}
	
	public Order() {
		orderNumber = 0;
		productName = "";
		price = 0;
		qty = 0;
	}

	/**
	 * @return the orderNumber
	 */
	public int getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @return the productID
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productID the productID to set
	 */
	public void setProductID(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}

	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	
	
	
}
