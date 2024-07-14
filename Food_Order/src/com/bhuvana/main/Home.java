package com.bhuvana.main;

public class Home extends Fast_Food
{
	 void  meth1()
	{
		System.out.println("welcome to THE COMFORT CORNER");
		System.out.println("           -------------------");
		System.out.println();
		System.out.println("	1)Starters");
		System.out.println("	2)Main course");
		System.out.println("	3)Desserts");
		System.out.println("	4)Fast Foods");
		System.out.println();
		System.out.println("====please order you food===");
		  int userchoice=sc.nextInt();
		  if(userchoice==1)
		  {
			  System.out.println("The beginning of a perfect meal starts with Starter.");
			  System.out.println("-----------------------------------------------------");
			  System.out.println();
			  Staters s=new Staters();
			  s.meth1();
		  }
		  else if(userchoice==2)
		  {
			  System.out.println("A perfect meal makes our day happy. eat more and stay happy");
			  System.out.println("-------------------------------------------------------------");
			   Main_course main=new Main_course();
			   main.meth1();
		  }
		  else  if(userchoice==3)
		  {
			     Desserts desserts=new Desserts();
			     desserts.meth1();
		  }
		  else if(userchoice==4)
		  {
			    Fast_Food home=new  Fast_Food();
			    home.meth1();
			     Home food1=new Home();
			     food1.drinks();
			 }
		  else
			  System.out.println("you choose invalid option");
	}
		 
	public static void main(String[] args)
	{
	
		Home food1 = new Home();
		food1.meth1();
	}
		
	}
	

