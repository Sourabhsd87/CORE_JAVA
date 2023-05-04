package lab_day5;

public enum ServicePlan {
	SILVER(1000),GOLD(2000),DIAMAND(5000),PLATINUM(10000);
	
	private double price;

	private ServicePlan(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name()+" cost="+getPrice();
	}
	
	
}
