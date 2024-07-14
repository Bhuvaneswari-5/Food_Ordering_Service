package com.bhuvana.main;

import java.util.Scanner;


public class Fast_Food 
{
	Scanner sc =new Scanner(System.in);
	String fav,fav1,fav2,fav3,fav4,fav5,fav6,fav7,fav8,fav9;
	
	void meth1() 
	{
		
		System.out.println("WELCOME TO FASTFOODS");
		
		System.out.println("\n");
		System.out.println("choose your option from below options");
		System.out.println("	1)pizza");
		System.out.println("	2)burger");
		System.out.println("	3)noodles");
		System.out.println("	4)fried chicken");
		
		
		int useroption=sc.nextInt();
		if(useroption==1)
		{
			System.out.println("----------------------------------------------------------");
			System.out.println("~~~~~~Happieness is a slice of pizza in each hand.~~~~~~");
			System.out.println("----------------------------------------------------------");
			System.out.println("\n");
			System.out.println("What kind of pizaa do you want?");
			System.out.println("\n");
			System.out.println("1)Veg");
			System.out.println("2)Non-veg");
			int kind=sc.nextInt();
			if(kind==1)
			{
				System.out.println("---------------------------------------------------");
				System.out.println("~~Deliciously satisfying, even without the meat~~");
				System.out.println("--------------------------------------------------");
				System.out.println("\n");
				System.out.println("	1)Rosted bell pepper and cheese pizza");
				System.out.println("	2)Indian style veg pizaa");
				System.out.println("	3)Mushroom sweet corn spinach pizaa");
				System.out.println("	4)Oven veg pizaa");
				System.out.println("	5)Cheesy veg pizaa");
				System.out.println();
			System.out.println("        Select your fav one");
			System.out.println("\n");
			String items[]= {"Please select your pizaa type","1)rosted bell pepper and cheese pizza","2)indian style veg pizaa","3)mushroom sweet corn spinach pizaa","4)oven veg pizaa","5)cheesy veg pizaa"};
			fav=items[sc.nextInt()];
			System.out.println("You have selected:"+" "+fav);
			
	
			System.out.println("Do You Want  Extra CHESSE and TOPINGS? "+" "+"press Y if yes otherwise press N");
			System.out.println("Y"+" "+"N");
			String input1 = sc.next();
			if(input1.equalsIgnoreCase("y"))
				System.out.println("ENJOY YOUR PIZAA WITH EXTRA CHESSE AND TOPINGS");
			else
				System.out.println("ENJOY YOUR PIZZA");
			}
			if(kind==2)//non veg pizaa
			{
				System.out.println("	1)Chicken pizaa");
				System.out.println("	2)Butter chicken pizza");
				System.out.println("	3)Bbq chicken pizaa");
				System.out.println("	4)Crispy fish pizza");
				System.out.println("	5)Rajma patty pizaa");
				System.out.println(" Select your fav one");
				System.out.println("\n");
				String items1[]= {"Plese select your burger type","1)Chicken pizza","2)Butter chicken pizza","3)Bbq chicken pizza","4)Crispy fish pizza","Rajma patty pizza"};
				 fav1=items1[sc.nextInt()];
				System.out.println("You hava selected:"+" "+fav1);
				System.out.println("****Enjoy your day by having a pizaa");
			}
		}
			
		else if(useroption==2)
		{
			System.out.println("---------------------------------------------------------");
			System.out.println("~~~~~The best burgers are simple,juicy,and messy~~~~~");
			System.out.println("--------------------------------------------------------");
			System.out.println("\n");
			System.out.println("What kind of burger do you want?");
			System.out.println("\n");
			System.out.println("1)Veg");
			System.out.println("2)Non-veg");
			int kind1=sc.nextInt();
			if(kind1==1)
			{
			System.out.println("	1)Big mac");
			System.out.println("	2)Quarter pounder");
			System.out.println("	3)Double quarter pounder");
			System.out.println("	4)Cheese burger");
			System.out.println("	5)Double cheese burger");
			System.out.println("Select your fav from above option");
			String item2[]= {"plese select your burger type","1)big mac","2)quarter pounder","3)double quarter pounder","4)cheese burger","5)double cheese burger"}	;		
			  fav2=item2[sc.nextInt()];
			System.out.println("You have selected :"+fav2);
			System.out.println("~~~Enjoy your burger~~~");
			}
			if(kind1==2)
			{
				System.out.println("	1)Chicken patty");
				System.out.println("	2)Mock rock chicken");
				System.out.println("	3)Peri peri grilled");
				System.out.println("	4)Mexican grilled");
				System.out.println("	5)Cheesy grilled chicken");
				String item3[]= {"Please select your option","1)chicken patty","2)mock rock chicken","3)peri peri chicken","4)mexican girlled","5)cheesy grilled chicken"};			
				 fav3=item3[sc.nextInt()];
				System.out.println("You have selected:"+fav3);
				System.out.println("~~~Enjoy your non-veg burger ~~~");
			}
		}
		else if(useroption==3)
		{
			System.out.println("----------------------------------------");
			System.out.println("~~~~~Every Noodle Is An Adventure~~~~");
			System.out.println("-----------------------------------------");
			System.out.println("What kind of noodles do you want? Choose Your Option");
			System.out.println("	1)Egg noodles");
			System.out.println("	2)Ramen noodles");
			System.out.println("	3)Rice stick noodles");
			String item4[]= {"plese select your option","1)egg noodles","2)ramen noodles","3)rice stick noodles"};
			 fav4=item4[sc.nextInt()];
			System.out.println("You have selected:"+fav4);
		}
		else if(useroption==4)
		{
			System.out.println("-------------------------------------");
			System.out.println("~~~Love is bucket of fried chicken~~~");
			System.out.println("---------------------------------------");
			System.out.println("choose your fav one");
			System.out.println("	1)small-6pieces");
			System.out.println("	2)medium -10pieces");
			System.out.println("	3)large-12 pieces");
			String item5[]= {"plese select your option","1)small-6pieces","2)medium -10pieces","3)large-12 pieces"};
			fav5=item5[sc.nextInt()];
			System.out.println("you hava selected :"+fav5);
			System.out.println("   Enjoy your day with bucket of chicken");
		}
}
	void meth2() 
	{
		System.out.println("   Do you Want to order anything else? if yes press Y otherwise N");
		System.out.println("Y"+" "+"N");
		String input2=sc.next();
		
		if(input2.equalsIgnoreCase("y"))
		{
			
			Fast_Food aobj=new Fast_Food();
			 aobj.meth1();
		}
		else
			System.out.println("have a good food and good day");
	}

	void drinks()
	{
		System.out.println("  Do you want to drink any thing ?.press y if yes otherwise n");
		System.out.println("Y"+" "+"N");
		String input3 = sc.next();
		if(input3.equalsIgnoreCase("y"))
		{
			
			System.out.println("	1)water");
			System.out.println("	2)coffee");
			System.out.println("	3)tea");
			System.out.println("	4)milk");
			System.out.println("	5)fruit juices");
			System.out.println("	6)soft drinks");
			System.out.println("	7)hot chocolate");
			System.out.println("choose your favt");
			 int useroption1=sc.nextInt();			
		
			 if(useroption1==1)
			 {
				 System.out.println("------water has no calories------");
				 System.out.println("have your water");
			 }
			 else if(useroption1==2)
			 {
				 System.out.println("-------Coffee makes everything possible-------");
				 System.out.println("what kind of coffee do you want");
				 System.out.println("	1)Cappuccino");
				 System.out.println("	2)Iced coffee");
				 System.out.println("	3)Cold brew");
				 System.out.println("	4)Red Eye");
				String [] items6= {	"plese choose an option","1)Cappuccino","2)Iced coffee","3)Cold brew","4)Red Eye"};
				 fav6=items6[sc.nextInt()];
				System.out.println(" You have selected :"+fav6);
			}
			 if(useroption1==3)
			 {
				 System.out.println("--------Enjoy life sip by sip,not gulp by gulp---------");
				 
				 System.out.println("what kind of tea do you want");
				 System.out.println("	1)Green tea");
				 System.out.println("	2)Hebal tea");
				 System.out.println("	3)Masala chai");
				 System.out.println("	4)Black tea");
				 System.out.println("	5)Herbal tea");
				 String [] items7= {"please choose an option","1)Green tea","2)Herbal tea","3)Masala tea","4)Black tea","5)Herbal tea"};
				fav7=items7[sc.nextInt()];
						 System.out.println("You have selected :"+fav7);
			 }
			 if(useroption1==4)
			 {
				 System.out.println("---------The foundation of a healthu life start with the milk");
				 System.out.println("Enjoy your milk");
			 }
			 if(useroption1==5)
			 {
				 
				 
				 System.out.println("------Realfruit-Real taste------");
				 System.out.println(" what kind of fruits juice do you need");
				 System.out.println("menu :");
				 System.out.println("	1)Apple");
				 System.out.println("	2)Banana");
				 System.out.println("	3)Grapes");
				 System.out.println("	4)Watermelon");
				 String[] items8= {"please select an option","1)Apple","2)Banana","3)Grapes","4)Watermelon"};
				  fav8=items8[sc.nextInt()];
				 System.out.println("You have selected :"+fav8);
			 }
			 if(useroption1==6)
			 {
				 System.out.println("---chill from inside----");
				 System.out.println("what kind of softdrink do you want");
				 System.out.println("		1)Sprite-Thirst for yours");
				 System.out.println("		2)Coca-Cola-make it real");
				 System.out.println("		3)Limca-Payass Bashao");
				 System.out.println("		4)Pepsi-That's what i like");
				 System.out.println("		5)Thumbs up-Taste the thunders");
				 String[] itemes9= {"please select an option","1)Sprite-Thirst for yours","2)Coca-Cola-make it real","3)Limca-Payass Bashao","4)Pepsi-That's what i like","5)Thumbs up-Taste the thunders"};
				  fav9=itemes9[sc.nextInt()];
				 System.out.println("you have selected :"+fav9);
			 }
		}
		else
		{
			System.out.println("Enjoy your day ");
		}
		
	}
	
}
