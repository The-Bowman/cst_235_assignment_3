package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

	Connection con = null;

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

		try {
			getAllOrders();
			insertOrder();
			getAllOrders();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// pushes user object data to the next page
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		service.test();

		// returns the next page
		return "Response.xhtml";
	}

	private void getAllOrders() throws SQLException {

		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
			if (con != null) {
				System.out.println("Success!!");
			}

			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM testapp.\"Orders\"";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("ID");
				String product_name = rs.getString("PRODUCT_NAME");
				float price = rs.getFloat("PRICE");
				System.out.println("ID: " + id);
				System.out.println("Name: " + product_name);
				System.out.println("Price: " + price);
			}
			rs.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Failure");
		} finally {
			if (con != null) {
				con.close();
			}

		}

	}

	private void insertOrder() {

		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
			if (con != null) {
				System.out.println("Success!!");
			}

			Statement stmt = con.createStatement();
			String sql = "INSERT INTO testapp.\"Orders\"(\"ORDER_NO\", \"PRODUCT_NAME\", \"PRICE\", \"QUANTITY\") VALUES('001122334455', 'This was inserted new', 25.00, 100)";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Failure during insert");
		}

	}

}
