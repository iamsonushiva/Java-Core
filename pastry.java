package com.company;

import java.util.List;

public class pastry extends cake{
	void display(List<String> pastryName, List<Float> pastryPrice)
	{
		System.out.println("----------------------------------");
		System.out.println(name + ":" + price + "per piece");
		System.out.println("----------------------------------");
	}
}
