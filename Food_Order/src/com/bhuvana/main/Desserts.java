package com.bhuvana.main;
import java.util.Scanner;

public class Desserts 
{
	Scanner sc=new Scanner(System.in);
	String fav99;
	String fav88;
	String fav77;
	void meth1()
	{
		System.out.println("--------------------------------");
		System.out.println("A few more calories won's hurt");
		System.out.println("--------------------------------");
		System.out.println();
		System.out.println("what kind od desserts you you want?");
		System.out.println("	1)Cakes");
		System.out.println("	2)Brownies");
		System.out.println("	3)Cheesecakes");
		System.out.println("	4)Custards");
		
		System.out.println();
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("What kind of cake do you want to order");
			System.out.println("	1)Pound cake");
			System.out.println("	2)Red velvet cake");
			System.out.println("	3)Sponge cake");
			System.out.println("	4)chocolate cake");
			System.out.println("	5)Rainbow cake");
			String[] items99= {"please  give your order","1)Pound cake","2)Red velvet cake","3)Sponge cake","4)chocolate cake","5)Rainbow cake"};
			fav99=items99[sc.nextInt()];
			System.out.println("You have selected : "+fav99);
		   
		}
		if(option==2)
		{
			System.out.println("What kind of Brownies do you want to order");
			System.out.println("	1)Classic brownies");
			System.out.println("	2)peanut butter brownies");
			System.out.println("	3)Brownies with Walnuts");
			System.out.println("	4)Caramel brownies");
			String[] items99= {"please place your order","1)Classic brownies","2)peanut butter brownies","3)Brownies with Walnuts","4)Caramel brownies"};
			 fav88=items99[sc.nextInt()];
			System.out.println("You have selected : "+fav88);
		
			}
		if(option==3)
		{
			System.out.println("What kind Sponge cake do you want to order");
			System.out.println("	1)Biscut sponge");
			System.out.println("	2)Chiffon sponge");
			System.out.println("	3)Venilla sponge");
			System.out.println("	4)Streamed chinese sponge");
			String[] items99= {"please place your order","1)Biscut sponge","2)Chiffon sponge","3)Venilla sponge","4)Streamed chinese sponge"};
			
			fav77=items99[sc.nextInt()];
			System.out.println("You have selected : "+fav77);
		
			
		}
		System.out.println("Do you to order anything else?press Y if yes otherwise N");
		 String d=sc.next();
		 if(d.equalsIgnoreCase("Y"))
		 {
			 Home food=new Home();
			 food.meth1();
	 }
	}

}
