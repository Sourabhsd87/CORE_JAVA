package com.app.tester;

import java.util.Scanner;

import com.app.fruits.Fruit;
import com.app.fruits.apple;
import com.app.fruits.mango;
import com.app.fruits.orange;

public class testeeeeer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of basket:");
		Fruit[] basket= new Fruit[sc.nextInt()];
		
		System.out.println("1:Add apple\n"
				+ "2:Add orange\n3:Add Mango\n"
				+ "4:Display names of all fruits in the basket.\n"
				+ "5: Display name,color,weight , taste of all fresh fruits , in the basket.\n"
				+ "6: Mark a fruit in a basket , as stale\n"
				+ "7:Mark all sour fruits stale\n"
				+ "8:Invoke fruit specific functionality (pulp / juice / jam)\n"
				+ "9:Invoke correct functionality (pulp / juice / jam)\n"
				+ "10: Exit ");
		int choice;
		int index=0;
		do
		{
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			if(index<basket.length)
			{
				System.out.println("Enter color,weight,name");
				basket[index++]=new apple(sc.next(),sc.nextDouble(), sc.next());
				break;
			}
			else
			{
				System.out.println("Array is Full");
			}
			break;
		case 2:
			if(index<basket.length)
			{
				System.out.println("Enter color,weight,name");
				basket[index++]=new orange(sc.next(),sc.nextDouble(), sc.next());
				break;
			}
			else
			{
				System.out.println("Array is Full");
			}
			break;
		case 3:
			if(index<basket.length)
			{
				System.out.println("Enter color,weight,name");
				basket[index++]=new mango(sc.next(),sc.nextDouble(), sc.next());
				break;
			}
			else
			{
				System.out.println("Array is Full");
			}
			break;
		case 4:
			for(int i=0;i<index;i++)
			{
				System.out.println(basket[i].getName());
			}
			break;
		case 5:
			for(int i=0;i<index;i++)
			{
			System.out.println(basket[i]);
			}
			break;
		case 6:
			System.out.println("Enter a index");
			int ind=sc.nextInt();
			if(ind<=index)
			{
				basket[ind].setFresh(false);
				break;
			}
			else
			{
				System.out.println("Fruit not present at current index");
			}
			break;
		case 7:
			for(Fruit f : basket)
			{
				if(f!=null)
				{
				if(f.taste().equals("sour"))
				{
					f.setFresh(false);
				}
				}
			}
			
			//for(int i=0;i<index;i++)
			//{
			//if(basket[i].=)
			break;
		case 8:
			for(Fruit f :basket)
			{
				if(f!=null)
				{
					if(f instanceof apple)
					{
						((apple)f).jam();
					}
					else if(f instanceof orange)
					{
						 ((orange)f).juice();
					}
					else if(f instanceof mango)
					{
						((mango) f).pulp();
					}
				}
			}
			break;
		case 9:
			break;
		case 10:
			System.out.println("----------EXIT-------------");
			break;
			default:
				System.out.println(":Invalid choice");
				break;
		}
		}while(choice!=10);

	}

}
