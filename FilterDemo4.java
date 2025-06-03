package com.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price )
	{
		this.id= id;
		this.name=name;
		this.price=price;
		
	}
	
	@Override
	public String toString() {
		return "Product [id= " + id + ", name=" + name + ", price=" + price + "]";
		
	}
	
}

public class FilterDemo4 {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<Product>();
		
		
		productList.add(new Product(1,"HP", 20000));
		productList.add(new Product(2,"Dell", 50000));
		productList.add(new Product(3,"Asus", 35000));
		productList.add(new Product(4,"MacBook", 60000));
		
		List<Product> productList2 = new ArrayList<Product>();
		
//		productList2=
				productList.stream().filter(p-> p.price>25000).forEach(pr-> System.out.println(pr.price));
//				collect(Collectors.toList());
				
		productList2=productList.stream().filter(p-> p.price>25000).collect(Collectors.toList());
		
		System.out.println(productList2);
		
		

	}

}
