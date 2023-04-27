package com.app.fruits;

public class mango extends Fruit{

	public mango(String color, double weight, String name) {
		super(color, weight, name);
	}

	@Override
	public String taste() {
		return "Sweet";
	}

	@Override
	public String toString() {
		return super.toString()+"mango [taste()=" + taste() + "]";
	}
	public void pulp()
	{
		System.out.println("name:"+getName()+"   color:"+getColor()+"   pulp is created");
	}
	
	
}
