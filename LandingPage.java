public static void main(String[] args) {
		//*The text below serves as the welcome message and gives the user an explanation of what is to come
		System.out.println("WELCOME TO THE AVENDERS VENDING MACHINE");
		System.out.println("The vending machine has a variety of products available for purchase. ");
	    System.out.println("All you have to do is enter the item code shown below.");
	    System.out.println("Each item selection is limited to 25.");
	    //*The (little lines) printed in the line below are used multiple times in this code for an aesthetically pleasing output thats easier to follow 
	    System.out.println("-----------------------------------------------------");
	    System.out.println(" ");
	    
	  //*NB:The verification code for the owner menu is 8162!!!!
		System.out.println("Item_code = 3692 & owners_pin = Restricted to admins ");
	    System.out.println("-----------------------------------------------------");
	    //*We initialised Item_code and 4812 in the next line
		int Item_code = 3692;
		int owners_pin = 4812;
		Scanner userInput = new Scanner(System.in);
		//*In the next line a message that clearly explains what is expected from the user is printed
		System.out.println("Please enter Item_code to display products or owners_pin for administrator options: ");
		//*The if statement below checks if the code entered is Item_code or userInput
		int Code = userInput.nextInt();
		//*If the code is Item_code then the user is taken to the Customer menu
		if (Code == Item_code){customerMenu();}
		//*If the code is userInput then the user is taken to the Owner menu
		else if (Code == owners_pin){ownerMenu();}
	              else {System.out.println("Invalid entry!");}
		
	}
	//*END OF LANDING PAGE 
