package com.app.fruits;

public class apple extends Fruit{

	public apple(String color, double weight, String name) {
		super(color, weight, name);
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sweet and sour";
	}

	@Override
	public String toString() {
		return super.toString()+"apple [taste()=" + taste() + "]";
	};
	
	public void jam()
	{
		System.out.println("name:"+getName()+"  Color:"+getColor()+" jam is created ");
	}

	
}
