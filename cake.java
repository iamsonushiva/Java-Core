package com.company;

import java.util.List;

public class cake {
	List<String> name;
	List<Float> price;

	public void setName(List<String> name) {
		this.name = name;
	}

	public void setPrice(List<Float> price) {
		this.price = price;
	}
	public static void display(String name,List<Float> price){
		for (int i=0;i<2;i++)
			System.out.println(name +" : \u20B9"+price.get(i)+" per pound");

	}



}
