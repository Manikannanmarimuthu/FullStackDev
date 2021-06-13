package com.practice.array;

public class Product {

	private static int count;
	private int id;
	private String product;
	private int cost;

	public Product(int id, String product, int cost) {
		this.id = id;
		this.product = product;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public static void main(String[] args) {
		Product[] product = new Product[3];

		Product product1 = new Product(10, "Mani", 20);
		Product product2 = new Product(20, "Kannan", 30);
		Product product3 = new Product(30, "Kalai", 40);

		product[0] = product1;
		product[1] = product2;
		product[2] = product3;

		for (Product temp : product) {
			System.out.println(temp.getId() + "  " + temp.getCost() + " " + temp.getProduct());
			count = count + temp.getCost();
		}

		System.out.println("************");
		System.out.println("Count is :: " + count);
		System.out.println("************");
	}

}
