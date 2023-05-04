package com.app.core;

public class Emp {
	private String id;
	private String name;
	private double salary;
	private String deptno;

	public Emp(String id, String name, double salary,String deptno) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptno = deptno;
	}

	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", deptno=" + deptno + "]";
	}


	//override equals to replace ref equality by content(PK) equality
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in emp eq");
		if(o instanceof Emp)
			if(this.deptno.equals(((Emp)o).deptno))
			{
				boolean t = this.id.equals(((Emp) o).id);
				System.out.println("id()equals="+t);
				return t;
			}		
			return false;
	}
	@Override
	public int hashCode()
	{
		System.out.println("in emp hashCode");
		return this.deptno.hashCode();
	}

}







