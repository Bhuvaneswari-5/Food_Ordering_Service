package com.bhuvana.main;

import java.util.Scanner;
public class Staters 
{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println("	1)non-veg");
		System.out.println("	2) veg");
		  int optionvalue=sc.nextInt();
		  if(optionvalue==1)
		  {
			  System.out.println("select your option");
			  try 
			  {
			  System.out.println("	1)Egg spring roll");
			  System.out.println("	2)chicken spting roll");
			  System.out.println("	3)chicken 65");
			  System.out.println("	4)chilli chicken");
			  String items[]={"please select your option","1)Egg spring roll","2)chicken spting roll","3)chicken 65","4)chilli chicken"};
			  String fav11=items[sc.nextInt()];
			  System.out.println("You hava selected :"+fav11);
			  }
			  catch(ArrayIndexOutOfBoundsException E)
			  {
				  System.out.println("you select out of the dispalayed items");
			  }
			 
			  System.out.println("Do you want to eat biriyani? press Y if yes otherwise N for no");
			   String a=sc.next();
			   if(a.equalsIgnoreCase("Y"))
			   {
				   System.out.println("A perfect meal makes our day happy. eat more and stay happy");
					  System.out.println("----------------------------------------------------------");
				   System.out.println("	What kind of biriyani do you want?");
					  Main_course main=new Main_course();
					   main.meth1();
					   
			   }
			   else if(a.equalsIgnoreCase("N"))
			   {
				   System.out.println("Do you want to  eat anything else? press Y if yes otherwise N for no");
				    String b=sc.next();
				    if(b.equalsIgnoreCase("Y"))
					   {
				    	Home food1 = new Home();
						food1.meth1();
					   }
				}
			   else
				   System.out.println("invalid option");
			   
		 }
		  else if(optionvalue==2)
		  {
			  System.out.println("The beginning of a perfect meal starts with Starter.");
			  System.out.println("-----------------------------------------------------");
			  System.out.println();
			  System.out.println("select your option");
			  System.out.println("	1)Samosa");
			  System.out.println("	2)Aloo Pakoda");
			  System.out.println("	3)veg manchurian dry");
			  System.out.println("	4)Dahi vada");
			  String [] items22  = {"please select your option","1)Samosa","2)Aloo Pakoda","3)veg manchurian dry","4)Dahi vada"};
			  String fav22=items22[sc.nextInt()];
			  System.out.println("You hava selected :"+fav22);
			  System.out.println("\n");
			  System.out.println();
			  System.out.println("Do you want to order biriyani? press Y if yes otherwise N for no");
			   String a=sc.next();
			   if(a.equalsIgnoreCase("Y"))
			   {

				  System.out.println("A perfect meal makes our day happy. eat more and stay happy");
				  System.out.println("-------------------------------------------------------------");
				   System.out.println("	What kind of biriyani do you want?");
					  Main_course main=new Main_course();
					   main.meth1();
			   }
			   else if(a.equalsIgnoreCase("N"))
			   {
				   System.out.println("Do you want to  eat anything else? press Y if yes otherwise N for no");
				    String b=sc.next();
				    if(b.equalsIgnoreCase("Y"))
					   {
				    	Home food1 = new Home();
						food1.meth1();
					   }
				}
			   else
				   System.out.println("invalid option");
			   
		}
		 else  if(optionvalue!=1 && optionvalue!=2)
		 {
		  
			 System.out.println("invaid option selected");
		 }
		  
		 
		  
		  
	}
	

}
