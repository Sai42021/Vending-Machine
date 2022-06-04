  //*We declared the products as public strings so they can be called in the customerMenu() & ownerMenu()
	   public static String C0001 = "M&M(C0001)";
	   public static String C0002 = "Maltesers(C0002)";
	   public static String C0003 = "Jelly-Beans(C0003)";
	   public static String C0004 = "Sour-worms(C0004)";
	   public static String C0007 = "Egg-salad-sandwich(C0007)";
	   public static String C8000 = "Pie(C8000)";
	   public static String C9000 = "Burger(C9000)"; 
	   public static String C0100 = "Latte(C0100)"; 
	   public static String C0200 = "Tea(C0200)";
	   public static String C0300 = "Cappuccino(C0300)";
	   public static String C0400 = "Hot-chocolate(C0400)";
	   public static String C0500 = "Coke(C0500)"; 
	   public static String C0600 = "Dr.Pepper(C0600)";
	   public static String C0700 = "Pepsi(C0700)";
	   public static String C1800 = "TAB(C1800)";
	   public static String C1900 = "Sprite(C1900)";
	   public static String C2100 = "Sorry we couldn't help you";
	   
	//*We then declare the prices as public variables to use them in both the customerMenu() & ownerMenu() 
	   public static double C0001Price = 10.00;
	   public static double C0002Price = 12.00;
	   public static double C0003Price = 7.00;
	   public static double C0004Price = 8.00;
	   public static double C0007Price = 35.00;
	   public static double C8000Price = 25.00;
	   public static double C9000Price = 30.00; 
	   public static double C0100Price = 25.00; 
	   public static double C0200Price = 15.00;
	   public static double C0300Price = 25.00;
	   public static double C0400Price = 15.00;
	   public static double C0500Price = 15.00; 
	   public static double C0600Price = 10.00;
	   public static double C0700Price = 10.00;
	   public static double C1800Price = 10.00;
	   public static double C1900Price = 10.00;
	   
	//*We Set a count on every item in the vending machine and declared them all as public to use them in any method  
	   public static int C0001count = 25;
	   public static int C0002count = 25;
	   public static int C0003count = 25;
	   public static int C0004count = 25;
	   public static int C0007count = 25;
	   public static int C8000count = 25;
	   public static int C9000count = 25;
	   public static int C0100count = 25;
	   public static int C0200count = 25;
	   public static int C0300count = 25;
	   public static int C0400count = 25;
	   public static int C0500count = 25;
	   public static int C0600count = 25;
	   public static int C0700count = 25;
	   public static int C1800count = 25;
	   public static int C1900count = 25;
	   
	   //* We initialised different notes to be used in the machine for change disbursement 
	   public static double fiveCent = 0.05; 
	   public static double tenCent = 0.10;
	   public static double fiftyCents = 0.50;
	   public static double oneDollar = 1.00;
	   public static double fiveDollar = 5.00;
	   public static double tenDollar = 10.00;
	   public static double twentyDollar = 20.00;
	   public static double thirtyDollar = 30.00;
	   public static double fiftyDollar = 50.00;
	   public static double oneHundredDollar = 100.00;
	   public static double twoHundredDollar = 200.00;
	
	   //*We set a count on all the notes in the machine for easier management options for the owner
	   public static int fiveCentCount = 100; 
	   public static int tenCentCount = 100;
	   public static int fiftyCentCount = 100;
	   public static int oneDollarCount = 500;
	   public static int fiveDollarCount = 100;
	   public static int tenDollarCount = 100;
	   public static int twentyDollarCount = 100;
	   public static int thirtyDollarCount = 100;
	   public static int fiftyDollarCount = 50;
	   public static int oneHundredDollarCount = 20;
	   public static int twoHundredDollarCount = 20;
	   public static double total = ((fiveCent * fiveCentCount) + (tenCent * tenCentCount) + (fiftyCents * fiftyCentCount) + 
			                        (oneDollar * oneDollarCount) + (fiveDollar * fiveDollarCount) + 
			                        (tenDollar * tenDollarCount) + (twentyDollar * twentyDollarCount) + (thirtyDollar * thirtyDollarCount)+
			                        (fiftyDollar * fiftyDollarCount) + (oneHundredDollar * oneHundredDollarCount) + (twoHundredDollar * twoHundredDollarCount));
	
