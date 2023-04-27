package com.app.fruits;

public class orange extends Fruit{

	public orange(String color, double weight, String name) {
		super(color, weight, name);
		
	}

	@Override
	public String taste() {
		return "sour";
	}

	@Override
	public String toString() {
		return super.toString()+"orange [taste()=" + taste() + "]";
	}
	
	public void juice()
	{
		System.out.println("Name:"+getName()+"   color:"+getColor()+"  juice is created");
	}

	
}
