package entities;

public class OrderItem {
	
	private int quantity;
	private double price;
	
	private Product product;

	public OrderItem() {
	}

	public OrderItem(int quantity, double price) {
		this.quantity = quantity;
		this.price = price;
	}

	public OrderItem(int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	//Getters & Setters
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	//Methods
	public double subTotal() {
		return getQuantity() * getPrice();
	}

	@Override
	public String toString() {
		return product.getName() +
				", $" + String.format("%.2f",product.getPrice()) +
				", Quantity: " + getQuantity() +
				", Subtotal: " + String.format("%.2f",subTotal());
	}
	
	

}
