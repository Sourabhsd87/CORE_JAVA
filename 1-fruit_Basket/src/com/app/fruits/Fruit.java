package com.app.fruits;

public abstract class Fruit {
private String color;
private double weight;
private String name;
private boolean fresh;
public Fruit(String color, double weight, String name) {
	super();
	this.color = color;
	this.weight = weight;
	this.name = name;
	this.fresh = true;
}
@Override
public String toString() {
	return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", Fresh=" +fresh+ "]";
}

abstract public String taste();

public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public boolean isFresh() {
	return fresh;
}
public void setFresh(boolean fresh) {
	this.fresh = fresh;
}




}
