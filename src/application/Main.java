package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import br.edu.unifacisa.si.p2.input.Input;
import entities.Customer;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {


	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter customer data:");
		String name = Input.leString("Name: ");
		String email = Input.leString("email: ");
		Date birthDate = Input.leDate("Birth date (DD/MM/YYYY): ");
		
		Customer customer = new Customer(name, email, birthDate);
		
		System.out.println("Enter order data:");
		OrderStatus status = OrderStatus.valueOf(Input.leString("Order status: "));
		
		Order order = new Order(new Date(), status, customer);
		
		int qtdOrder = Input.leInt("How many items to this order? ");
		
		for (int i = 1; i <= qtdOrder; i++) {
			System.out.println("Enter #" + i + " item data:");
			String productName = Input.leString("Product name: ");
			double productPrice = Input.leDouble("Product Price: ");

			Product product = new Product(productName, productPrice);

			int quantity = Input.leInt("Quatity: ");

			OrderItem orderItem = new OrderItem(quantity, productPrice, product); 

			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
	}

}
