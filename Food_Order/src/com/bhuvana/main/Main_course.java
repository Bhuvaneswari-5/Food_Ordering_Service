package com.bhuvana.main;
import java.util.Scanner;
public class Main_course 
{
	Scanner sc=new Scanner(System.in);
	String fav33;
	void meth1() 
	{
		try
		{
		System.out.println("               MENU                ");
		System.out.println("        -----------------------");
		System.out.println("	| 1)KOLKATA BIRYANI 	|");
		System.out.println("	| 2)SINDHI BIRYANI      |");
		System.out.println("	| 3)MEMONI BIRYANI   	|");
		System.out.println("	| 4)MALABAR BIRYANI  	|");
		System.out.println("	| 5)THALASSERY BIRYANI  |");
		System.out.println("	| 6)AMBUR BIRYANI       |");
		System.out.println("	| 7)CHICKEN BIRIYANI    |");
		System.out.println("	| 8)MUTTON BIRIYANI     |");
		System.out.println("	| 9)CHICKEN DUM BIRYANI |");
		System.out.println("         -------------------------");
		String[] items33= {"please select an optin","1)KOLKATA BIRYANI","2)SINDHI BIRYANI ","3)MEMONI BIRYANI"," 4)MALABAR BIRYANI ","5)THALASSERY BIRYANI","6)AMBUR BIRYANI","7)CHICKEN BIRIYANI ","8)MUTTON BIRIYANI  ","9)CHICKEN DUM BIRYANI"};
		 fav33=items33[sc.nextInt()];
		System.out.println("You hava selected :"+fav33);
		}
		  catch(Exception e)
		{
			  System.out.println("you selected an wrong option");
		}
		  
		 
	    
		System.out.println();
		System.out.println("Do you want to order desserts ?press Y if yes other wise N for no");
		if(sc.next().equalsIgnoreCase("y"))
		{
			 Desserts desserts=new Desserts();
		     desserts.meth1();
		}
		else if(sc.next().equalsIgnoreCase("n"))
		{
			System.out.println("Do you want to order fastfoods?press Y if yes other wise N for no");
			if(sc.next().equalsIgnoreCase("y"))
			{
				 Fast_Food home=new Fast_Food();
				 home.meth1();
			}
		}
	
	
	
	}

}
