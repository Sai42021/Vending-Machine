 //*Beginning of Owner menu 
		    public static void ownerMenu() {
			Scanner userInput = new Scanner(System.in);
			//*NB:The verification code is 8162!!!!
			System.out.println("Please enter verification code: ");
			int verificationCode = userInput.nextInt();
			
			if (verificationCode == 8162){
				
				//* Each action has a code that the admin then has to enter in order for them to execute that action
				
				System.out.println("                                          ");
				System.out.println("Actions to execute:");
				System.out.println("-----------------------------------------------------");
				
				//*Space is added in between to make it easier to read the prompt from the console
			    System.out.println("Restock(2310)");
			    System.out.println("Add new Item(2311)");
			    System.out.println("Change price of item(2312)");
			    System.out.println("Cash in(2313)");
			    System.out.println("Cash out(2314)");
			    System.out.println("Print summary of items in stock(2315)");
			    System.out.println("Print out amount of cash in categories(2316)");
			    System.out.println("Print items that need re-stocking(2317)");
			    System.out.println("-----------------------------------------------------");
			    System.out.println("                                          ");
			    
				//*The admin is than prompted to enter the code for the preferred action
			    
				Scanner actioInput = new Scanner(System.in); 
				System.out.println("Enter code for perfered action: ");
				System.out.println("-----------------------------------------------------");
				int actionCode = actioInput.nextInt();
				
				//*Re-stock(2310)
				if(actionCode == 2310) {
					
					System.out.println("                                          ");
					System.out.println("Available products and codes shown below: ");
					System.out.println("-----------------------------------------------------");
					System.out.println(C0001);
					System.out.println("                                          ");
			        System.out.println(C0002);
			        System.out.println("                                          ");
			        System.out.println(C0003);
			        System.out.println("                                          ");
			        System.out.println(C0004);
			        System.out.println("                                          ");
			        System.out.println(C0007);
			        System.out.println("                                          ");
			        System.out.println(C8000);
			        System.out.println("                                          ");
			        System.out.println(C9000);
			        System.out.println("                                          ");
			        System.out.println(C0100);
			        System.out.println("                                          ");
			        System.out.println(C0200);
			        System.out.println("                                          ");
			        System.out.println(C0300);
			        System.out.println("                                          ");
			        System.out.println(C0400);
			        System.out.println("                                          ");
			        System.out.println(C0500);
			        System.out.println("                                          ");
			        System.out.println(C0600);
			        System.out.println("                                          ");
			        System.out.println(C0700);
			        System.out.println("                                          ");
			        System.out.println(C1800);
			        System.out.println("                                          ");
			        System.out.println(C1900);
			        System.out.println("-----------------------------------------------------");
					//*Space is added in between to make it easier to read the prompt from the console
					
					System.out.println("                                          ");

				System.out.println("Enter the name and code of item (As shown above) to be re-stocked and the amount you want to add(+) seperated by a single SPACE: "); 
				Scanner userInputForRestocking = new Scanner(System.in);
				String ItemtoRestock1 = userInputForRestocking.nextLine();
				int ItemtoRestockParts = ItemtoRestock1.indexOf(" ");
				String ItemtoRestock = ItemtoRestock1.substring(0,ItemtoRestockParts);
				String amountToAdd1 = ItemtoRestock1.substring(ItemtoRestock1.lastIndexOf(" ") + 1);
				
				ItemtoRestock1 = ItemtoRestock.toLowerCase();
				int amountToAdd = Integer.parseInt(amountToAdd1);
				
				//* We wrote a nested case statement to increment the items counter based on the admins inputs 
				
				switch(ItemtoRestock1) {
				   case  "m&m(c0001)":
					   C0001count = C0001count + amountToAdd;
					   System.out.println(C0001 + " = " + C0001count);
				    break;
				   case "maltesers(c0002)":
					   C0002count = C0002count + amountToAdd;
					   System.out.println(C0002 + " = " + C0002count);
				    break;
				   case "jelly-beans(c0003)":
					   C0003count = C0003count + amountToAdd;
					   System.out.println(C0003 + " = " + C0003count);
					    break;
				   case "sour-worms(c0004)":
					   C0004count = C0004count + amountToAdd;
					   System.out.println(C0004 + " = " + C0004count);
					    break;
				   case "egg-salad-sandwich(c0007)":
					   C0007count =  C0007count + amountToAdd;
					   System.out.println(C0007 + " = " + C0007count);
					    break;
				   case "pie(c8000)":
					   C8000count = C8000count + amountToAdd;
					   System.out.println(C8000 + " = " + C8000count);
					    break;
				   case "burger(c9000)":
					   C9000count = C9000count + amountToAdd;
					   System.out.println(C9000 + " = " + C9000count);
					    break;
				   case "latte(c0100)":
					   C0100count = C0100count + amountToAdd;
					   System.out.println(C0100 + " = " + C0100count);
					    break;
				   case "tea(c0200)":
					   C0200count = C0200count + amountToAdd;
					   System.out.println(C0200 + " = " + C0200count);
					    break;
				   case "cappuccino(c0300)":
					   C0300count = C0300count + amountToAdd;
					   System.out.println(C0300 + " = " + C0300count);
					    break;
				   case "hot-chocolate(c0400)":
					   C0400count = C0400count + amountToAdd;
					   System.out.println(C0400 + " = " + C0400count);
					    break;
				   case "coke(c0500)":
					   C0500count = C0500count + amountToAdd;
					   System.out.println(C0500 + " = " + C0500count);
					    break;
				   case "dr.pepper(c0600)":
					   C0600count = C0600count + amountToAdd;
					   System.out.println(C0600 + " = " + C0600count);
					    break;
				   case "pepsi(c0700)":
					   C0700count = C0700count + amountToAdd;
					   System.out.println(C0700 + " = " + C0700count);
					    break;
				   case "tab(c1800)":
					   C1800count = C1800count + amountToAdd;
					   System.out.println(C1800 + " = " + C1800count);
					    break;
				   case "sprite(c1900)":
					   C1900count = C1900count + amountToAdd;
					   System.out.println(C1900 + " = " + C1900count);
					    break;
					default: System.out.println("Invalid entry! Please check your spelling and spacing." + "'" + ItemtoRestock + "'");    
				    }
				 System.out.println("-----------------------------------------------------");
				}
				
				//*Add new Item(2311)
				else if(actionCode == 2311) {
					Scanner newIteminput = new Scanner(System.in); 
					
					System.out.println("                                                     ");
					System.out.println("Available products and codes shown below: ");
					System.out.println("-----------------------------------------------------");
					System.out.println(C0001);
					System.out.println("                                          ");
			        System.out.println(C0002);
			        System.out.println("                                          ");
			        System.out.println(C0003);
			        System.out.println("                                          ");
			        System.out.println(C0004);
			        System.out.println("                                          ");
			        System.out.println(C0007);
			        System.out.println("                                          ");
			        System.out.println(C8000);
			        System.out.println("                                          ");
			        System.out.println(C9000);
			        System.out.println("                                          ");
			        System.out.println(C0100);
			        System.out.println("                                          ");
			        System.out.println(C0200);
			        System.out.println("                                          ");
			        System.out.println(C0300);
			        System.out.println("                                          ");
			        System.out.println(C0400);
			        System.out.println("                                          ");
			        System.out.println(C0500);
			        System.out.println("                                          ");
			        System.out.println(C0600);
			        System.out.println("                                          ");
			        System.out.println(C0700);
			        System.out.println("                                          ");
			        System.out.println(C1800);
			        System.out.println("                                          ");
			        System.out.println(C1900);
			        System.out.println("-----------------------------------------------------");
					//*Space is added in between to make it easier to read the prompt from the console
					
					System.out.println("                                          ");
					
					System.out.println("Enter name and code of new item according to the following naming convention e.g M&M(C0001)");
					String newItemAndCode = newIteminput.nextLine();
					
					System.out.println("You have successfully added " + newItemAndCode + " to the vending machine.");
					System.out.println("-----------------------------------------------------");
				}
				//*Change price of item(2312)
				else if(actionCode == 2312) {
					System.out.println("                                                     ");
					System.out.println("Available products and codes shown below: ");
					System.out.println("-----------------------------------------------------");
					System.out.println(C0001 + "  N$" + C0001Price);
					System.out.println("                                          ");
			        System.out.println(C0002 + "  N$" + C0002Price);
			        System.out.println("                                          ");
			        System.out.println(C0003 + "  N$" + C0003Price);
			        System.out.println("                                          ");
			        System.out.println(C0004 + "  N$" + C0004Price);
			        System.out.println("                                          ");
			        System.out.println(C0007 + "  N$" + C0007Price);
			        System.out.println("                                          ");
			        System.out.println(C8000 + "  N$" + C8000Price);
			        System.out.println("                                          ");
			        System.out.println(C9000 + "  N$" + C9000Price);
			        System.out.println("                                          ");
			        System.out.println(C0100 + "  N$" + C0100Price);
			        System.out.println("                                          ");
			        System.out.println(C0200 + "  N$" + C0200Price);
			        System.out.println("                                          ");
			        System.out.println(C0300 + "  N$" + C0300Price);
			        System.out.println("                                          ");
			        System.out.println(C0400 + "  N$" + C0400Price);
			        System.out.println("                                          ");
			        System.out.println(C0500 + "  N$" + C0500Price);
			        System.out.println("                                          ");
			        System.out.println(C0600 + "  N$" + C0600Price);
			        System.out.println("                                          ");
			        System.out.println(C0700 + "  N$" + C0700Price);
			        System.out.println("                                          ");
			        System.out.println(C1800 + "  N$" + C1800Price);
			        System.out.println("                                          ");
			        System.out.println(C1900 + "  N$" + C1900Price);
			        System.out.println("-----------------------------------------------------");
					//*Space is added in between to make it easier to read the prompt from the console
					
					System.out.println("                                          ");
					
					System.out.println("Enter the code of the item who's price you would like to alter and enter the new price of the item seperated by a single space: e.g C0001 20 . NB round off all values no decimals allowed! ");
					System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					Scanner itemAlter = new Scanner(System.in); 
					String fullentry = itemAlter.nextLine();
					
					//*The following lines of code split the users input into two separate string variables needed for switch statement
					int fullentryParts = fullentry.indexOf(" ");
					String itemCode = fullentry.substring(0,fullentryParts);
					String newPricePosition = fullentry.substring(fullentry.lastIndexOf(" ") + 1);
					
					int newPriceint = Integer.parseInt(newPricePosition);
					Double newPrice = Double.valueOf(newPriceint);										
					
					//*We created a switch statement to change a products price or name based on what the admins inputs
					switch(itemCode) {
					
					   case "C0001":
						C0001Price = newPrice;
						System.out.println("You have successfully changed this items price to N$" + new DecimalFormat("0.00").format(newPrice) + "!");
					    break;
					   case "C0002":
						   C0002Price = newPrice;
						   System.out.println("You have successfully changed this items price to N$" + new DecimalFormat("0.00").format(newPrice) + "!");
					    break;
					   case "C0003":
						   C0003Price = newPrice;
						   System.out.println("You have successfully changed this items price to N$" + new DecimalFormat("0.00").format(newPrice) + "!");
						    break;
					   case "C0004":
						   C0004Price = newPrice;
						   System.out.println("You have successfully changed this items price to N$" + new DecimalFormat("0.00").format(newPrice) + "!");
						    break;
					   case "C0007":
						   C0007Price =  newPrice;
						   System.out.println("You have successfully changed this items price to N$" + new DecimalFormat("0.00").format(newPrice) + "!");
						    break;
					   case "C8000":
						   C8000Price = newPrice;
						   System.out.println("You have successfully changed this items price to N$" + new DecimalFormat("0.00").format(newPrice) + "!");
						    break;
					   case "C9000":
						   C9000Price = newPrice;
						   System.out.println("You have successfully changed this items price to N$" + new DecimalFormat("0.00").format(newPrice) + "!");
						    break;
					   case "C0100":
						   C0100Price = newPrice;
						   System.out.println("You have successfully changed this items price to N$" + new DecimalFormat("0.00").format(newPrice) + "!");
						    break;
					   case "C0200":
						   C0200Price = newPrice;
						   System.out.println("You have successfully changed this items price to N$" + new DecimalFormat("0.00").format(newPrice) + "!");
						    break;
					   case "C0300":
						   C0300Price = newPrice ;
						   System.out.println("You have successfully changed this items price to N$" + new DecimalFormat("0.00").format(newPrice) + "!");
						    break;
					   case "C0400":
						   C0400Price = newPrice;
						   System.out.println("You have successfully changed this items price to N$" + new DecimalFormat("0.00").format(newPrice) + "!");
						    break;
					   case "C0500":
						   C0500Price = newPrice;
						   System.out.println("You have successfully changed this items price to N$" + new DecimalFormat("0.00").format(newPrice) + "!");
						    break;
					   case "C0600":
						   C0600Price = newPrice;
						   System.out.println("You have successfully changed this items price to N$" + new DecimalFormat("0.00").format(newPrice) + "!");
						    break;
					   case "C0700":
						   C0700Price = newPrice;
						   System.out.println("You have successfully changed this items price to N$" + new DecimalFormat("0.00").format(newPrice) + "!");
						    break;
					   case "C1800":
						   C1800Price = newPrice;
						   System.out.println("You have successfully changed this items price to N$" + new DecimalFormat("0.00").format(newPrice) + "!");
						    break;
					   case "C1900":
						   C1900Price = newPrice;
						   System.out.println("You have successfully changed this items price to N$" + new DecimalFormat("0.00").format(newPrice) + "!");
						    break;
						default: System.out.println("Invalid entry! Please check your spelling and spacing." + "'" + itemCode + "'" + " and " + "'" + new DecimalFormat("0.00").format(newPrice) + "'" );    	
					}
					System.out.println("-----------------------------------------------------");
				} 
				//*Cash in(2313));
				else if(actionCode == 2313) {
					System.out.println("                                                     ");
					System.out.println("Available notes/coins: ");
					System.out.println("-----------------------------------------------------");
					System.out.println("N$0.05" + " = " +fiveCentCount); 
					System.out.println("                                          ");
					System.out.println("N$0.10" + " = " + tenCentCount);
					System.out.println("                                          ");
					System.out.println("N$0.50" + " = " +fiftyCentCount); 
					System.out.println("                                          ");
					System.out.println("N$1.00" + " = " + oneDollarCount);
					System.out.println("                                          ");
					System.out.println("N$5.00" + " = " + fiveDollarCount);
					System.out.println("                                          ");
					System.out.println("N$10.00" + " = " + tenDollarCount);
					System.out.println("                                          ");
					System.out.println("N$20.00" + " = " + twentyDollarCount);
					System.out.println("                                          ");
					System.out.println("N$30.00" + " = " + thirtyDollarCount);
					System.out.println("                                          ");
					System.out.println("N$50.00" + " = " + fiftyDollarCount);
					System.out.println("                                          ");
					System.out.println("N$100.00" + " = " + oneHundredDollarCount);
					System.out.println("                                          ");
					System.out.println("N$200.00" + " = " + twoHundredDollarCount);
					System.out.println("-----------------------------------------------------");
					System.out.println("                                          ");
					
					System.out.println("-----------------------------------------------------");
					System.out.println("Total = " + new DecimalFormat("0.00").format(total));
					System.out.println("-----------------------------------------------------");
					
					Scanner cashInInput = new Scanner(System.in); 
					System.out.println("Enter the name of the note/coin you would like to increment or decrement and the new amount of that note/coin seperated by a single space e.g N$1.00 200: ");
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
					String ca$hToChangePlusnewCa$hAmount = cashInInput.nextLine();
					
					//*The following lines of code split the users input into two separate string variables needed for switch statement
					int cashInInputParts = ca$hToChangePlusnewCa$hAmount.indexOf(" ");
					String ca$hToChange = ca$hToChangePlusnewCa$hAmount.substring(0,cashInInputParts);
					String newCa$hAmountStr = ca$hToChangePlusnewCa$hAmount.substring(ca$hToChangePlusnewCa$hAmount.lastIndexOf(" ") + 1);
					
					int newCa$hAmount = Integer.parseInt(newCa$hAmountStr);
					
					switch(ca$hToChange) {
					
					case "N$0.05":
						fiveCentCount = newCa$hAmount;
						total = total + (newCa$hAmount * fiveCent);
						System.out.println("You have successfully changed N$0.05 count"+ " to " + newCa$hAmount );
						break;
					case "N$0.10":
						tenCentCount = newCa$hAmount;
						total = total + (newCa$hAmount * tenCent);
						System.out.println("You have successfully changed N$0.10 count" + " to " + newCa$hAmount );
						break;
					case "N$0.50":
						fiftyCentCount = newCa$hAmount;
						total = total + (newCa$hAmount * fiftyCents);
						System.out.println("You have successfully changed N$0.50 count" + " to " + newCa$hAmount );
						break;
					case "N$1.00":
						oneDollarCount = newCa$hAmount;
						total = total + (newCa$hAmount * oneDollar);
						System.out.println("You have successfully changed N$1.00 count" + " to " + newCa$hAmount );
						break;
					case "N$5.00":
						fiveDollarCount = newCa$hAmount;
						total = total + (newCa$hAmount * fiveDollar);
						System.out.println("You have successfully changed N$5.00 count" + " to " + newCa$hAmount );
						break;
					case "N$10.00":
						tenDollarCount = newCa$hAmount;
						total = total + (newCa$hAmount * tenDollar);
						System.out.println("You have successfully changed N$10.00 count" + " to " + newCa$hAmount );
						break;
					case "N$20.00":
						twentyDollarCount = newCa$hAmount;
						total = total + (newCa$hAmount * twentyDollar);
						System.out.println("You have successfully changed N$20.00 count" + " to " + newCa$hAmount );
						break;
					case "N$30.00":
						thirtyDollarCount = newCa$hAmount;
						total = total + (newCa$hAmount * thirtyDollar);
						System.out.println("You have successfully changed N$30.00 count" + " to " + newCa$hAmount );
						break;
					case "N$50.00":
						fiftyDollarCount = newCa$hAmount;
						total = total + (newCa$hAmount * fiftyDollar);
						System.out.println("You have successfully changed N$50.00 count" + " to " + newCa$hAmount );
						break;
					case "N$100.00":
						oneHundredDollarCount = newCa$hAmount;
						total = total + (newCa$hAmount * oneHundredDollar);
						System.out.println("You have successfully changed N$100.00 count" + " to " + newCa$hAmount );
						break;
					case "N$200.00":
						twoHundredDollarCount = newCa$hAmount;
						total = total + (newCa$hAmount * twoHundredDollar);
						System.out.println("You have successfully changed N$200.00 count" + " to " + newCa$hAmount );
						break;
						default: System.out.println("Invalid entry!! Check entry and try again.");
					}
					System.out.println("-----------------------------------------------------");
				}
				//*Cash out(2314)
				else if(actionCode == 2314) {
					Scanner cash0utInput = new Scanner(System.in); 
					System.out.println("                                       ");
					System.out.println("There is a total of N$" + new DecimalFormat("0.00").format(total) + " in the vending machine.");
					System.out.println("-----------------------------------------------------");
					System.out.println("Enter the amount you want to cash out: ");
					System.out.println("-----------------------------------------------------");
					double cashOutAmountToDesplay = cash0utInput.nextDouble();
					double cashOutAmount = cashOutAmountToDesplay;
					
					double real_cashOutAmount = cashOutAmount;
					
					int two_hundred_dollars = (int) cashOutAmount / 200;
					cashOutAmount = cashOutAmount % 200; 
					
					int one_hundred_dollars = (int) cashOutAmount / 100;
					cashOutAmount = cashOutAmount % 100; 
					
					int fifty_dollars = (int) cashOutAmount / 50;
					cashOutAmount = cashOutAmount % 50; 
					
					int thirty_dollars = (int) cashOutAmount / 30;
					cashOutAmount = cashOutAmount % 30; 
					
					int twenty_dollars = (int) cashOutAmount / 20;
					cashOutAmount = cashOutAmount % 20; 
					
					int ten_dollars = (int) cashOutAmount / 10;
					cashOutAmount = cashOutAmount % 10;
					
					int five_dollars = (int) cashOutAmount / 5;
					cashOutAmount = cashOutAmount % 5;
					
					int one_dollar = (int)cashOutAmount / 1;
					cashOutAmount = cashOutAmount % 1;
					
					double fifty_cent = cashOutAmount / 0.5;
					cashOutAmount = cashOutAmount % 0.5;
					
					double ten_cents = (int) cashOutAmount % 0.10;
					cashOutAmount = cashOutAmount % 0.10;
					
					double five_cents = (int) cashOutAmount; 
					
					  fiveCentCount = (int) (fiveCentCount - five_cents); 
					  tenCentCount = (int) (tenCentCount - ten_cents);
					  fiftyCentCount = (int) (fiftyCentCount - fifty_cent);
					  oneDollarCount = oneDollarCount - one_dollar;
					  fiveDollarCount = fiveDollarCount - five_dollars;
					  tenDollarCount = tenDollarCount - ten_dollars;
					  twentyDollarCount = twentyDollarCount - twenty_dollars;
					  thirtyDollarCount = thirtyDollarCount - thirty_dollars;
					  fiftyDollarCount = fiftyDollarCount - fifty_dollars;
					  oneHundredDollarCount = oneHundredDollarCount - one_hundred_dollars;
					  twoHundredDollarCount = twoHundredDollarCount - two_hundred_dollars;
					  total = total - real_cashOutAmount;
					  
					  System.out.println("You have successfully cashed out N$" + new DecimalFormat("0.00").format(cashOutAmountToDesplay));
					  System.out.println("-----------------------------------------------------");
					  System.out.println("Disbursed as follows: " + two_hundred_dollars + " x N$ 200; " + one_hundred_dollars 
							  + " x N$ 100; " + fifty_dollars + " x N$ 50; " + thirty_dollars 
							  + " x N$ 30; " + twenty_dollars + " x N$ 20; " + ten_dollars + " x N$10; " 
							  + five_dollars +" x N$5; " + one_dollar + " x N$1; " 
							  +new DecimalFormat("0").format(fifty_cent)  + " x 50c; " + 
							  new DecimalFormat("0").format(ten_cents) + " x 10c; " + 
							  new DecimalFormat("0").format(five_cents) + " x 5c; " );
					  
					  System.out.println("-----------------------------------------------------");
					  
					  System.out.println("There is a total of " + "N$" + new DecimalFormat("0.00").format(total) + " left in the vending machine.");
					  System.out.println("-----------------------------------------------------");
				}
				//*Print summary of items in stock(2315)
				else if(actionCode == 2315) {
					
					System.out.println("                                                      ");
					System.out.println("Summary of stock: ");
					System.out.println("-----------------------------------------------------");
					System.out.println(C0001 + ": " + C0001count + " in stock");
					System.out.println("                                          ");
	                System.out.println(C0002 + ": " + C0002count + " in stock");
	                System.out.println("                                          ");
		            System.out.println(C0003 + ": " + C0003count + " in stock");
		            System.out.println("                                          ");
		            System.out.println(C0004 + ": " + C0004count + " in stock");
		            System.out.println("                                          ");
		            System.out.println(C0007 + ": " + C0007count + " in stock");
		            System.out.println("                                          ");
		            System.out.println(C8000 + ": " + C8000count + " in stock");
		            System.out.println("                                          ");
		            System.out.println(C9000 + ": " + C9000count + " in stock");
		            System.out.println("                                          ");
		            System.out.println(C0100 + ": " + C0100count + " in stock");
		            System.out.println("                                          ");
		            System.out.println(C0200 + ": " + C0200count + " in stock");
		            System.out.println("                                          ");
		            System.out.println(C0300 + ": " + C0300count + " in stock");
		            System.out.println("                                          ");
		            System.out.println(C0400 + ": " + C0400count + " in stock");
		            System.out.println("                                          ");
		            System.out.println(C0500 + ": " + C0500count + " in stock");
		            System.out.println("                                          ");
		            System.out.println(C0600 + ": " + C0600count + " in stock");
		            System.out.println("                                          ");
		            System.out.println(C0700 + ": " + C0700count + " in stock");
		            System.out.println("                                          ");
		            System.out.println(C1800 + ": " + C1800count + " in stock");
		            System.out.println("                                          ");
		            System.out.println(C1900 + ": " + C1900count + " in stock");
		            
				}
				//*Print out amount of cash in categories(2316)
				else if(actionCode == 2316) {
					
					System.out.println("                                           ");
					System.out.println("Amount of cash in categories: ");
					System.out.println("-----------------------------------------------------");
					System.out.println("N$0.05" + " = " +fiveCentCount); 
					System.out.println("                                          ");
					System.out.println("N$0.10" + " = " + tenCentCount);
					System.out.println("                                          ");
					System.out.println("N$0.50" + " = " +fiftyCentCount); 
					System.out.println("                                          ");
					System.out.println("N$1.00" + " = " + oneDollarCount);
					System.out.println("                                          ");
					System.out.println("N$5.00" + " = " + fiveDollarCount);
					System.out.println("                                          ");
					System.out.println("N$10.00" + " = " + tenDollarCount);
					System.out.println("                                          ");
					System.out.println("N$20.00" + " = " + twentyDollarCount);
					System.out.println("                                          ");
					System.out.println("N$30.00" + " = " + thirtyDollarCount);
					System.out.println("                                          ");
					System.out.println("N$50.00" + " = " + fiftyDollarCount);
					System.out.println("                                          ");
					System.out.println("N$100.00" + " = " + oneHundredDollarCount);
					System.out.println("                                          ");
					System.out.println("N$200.00" + " = " + twoHundredDollarCount);
					System.out.println("-----------------------------------------------------");
					System.out.println("Total = " + "N$" + new DecimalFormat("0.00").format(total));
					System.out.println("-----------------------------------------------------");
				}
				//*Print items that need re-stocking(2317)
				else if(actionCode == 2317) {
                           if(C0001count < 25) {System.out.println(C0001 + "is less than required amount and needs to be restocked. Please do check summary of stock.");
                           System.out.println("                                          ");}
                           if(C0001count < 25) {System.out.println(C0001 + ", is less than required amount and needs to be restocked. Please do check summary of stock.");
                           System.out.println("                                          ");}
                           if(C0002count < 25) {System.out.println(C0002 + ", is less than required amount and needs to be restocked. Please do check summary of stock.");
                           System.out.println("                                          ");}
                           if(C0003count < 25) {System.out.println(C0003 + ", is less than required amount and needs to be restocked. Please do check summary of stock.");
                           System.out.println("                                          ");}
                           if(C0004count < 25) {System.out.println(C0004 + ", is less than required amount and needs to be restocked. Please do check summary of stock.");
                           System.out.println("                                          ");}
                           if(C0007count < 25) {System.out.println(C0007 + ", is less than required amount and needs to be restocked. Please do check summary of stock.");
                           System.out.println("                                          ");}
                           if(C8000count < 25) {System.out.println(C8000 + ", is less than required amount and needs to be restocked. Please do check summary of stock.");
                           System.out.println("                                          ");}
                           if(C9000count < 25) {System.out.println(C9000 + ", is less than required amount and needs to be restocked. Please do check summary of stock.");
                           System.out.println("                                          ");}
                           if(C0100count < 25) {System.out.println(C0100 + ", is less than required amount and needs to be restocked. Please do check summary of stock.");
                           System.out.println("                                          ");}
                           if(C0200count < 25) {System.out.println(C0200 + ", is less than required amount and needs to be restocked. Please do check summary of stock.");
                           System.out.println("                                          ");}
                           if(C0300count < 25) {System.out.println(C0300 + ", is less than required amount and needs to be restocked. Please do check summary of stock.");
                           System.out.println("                                          ");}
                           if(C0400count < 25) {System.out.println(C0400 + ", is less than required amount and needs to be restocked. Please do check summary of stock.");
                           System.out.println("                                          ");}
                           if(C0600count < 25) {System.out.println(C0600 + ", is less than required amount and needs to be restocked. Please do check summary of stock.");
                           System.out.println("                                          ");}
                           if(C0700count < 25) {System.out.println(C0700 + ", is less than required amount and needs to be restocked. Please do check summary of stock.");
                           System.out.println("                                          ");}
                           if(C1800count < 25) {System.out.println(C1800 + ", is less than required amount and needs to be restocked. Please do check summary of stock.");
                           System.out.println("                                          ");}
                           if(C1900count < 25) {System.out.println(C1900 + ", is less than required amount and needs to be restocked. Please do check summary of stock.");
                           System.out.println("                                          ");}
                           else {System.out.println("                                          ");
                        	   System.out.println("Nothing else needs restocking at the moment.");}
				  
				  }else {System.out.println("Invalid code!! Try again.");}
				System.out.println("-----------------------------------------------------");}
			    System.out.println("                                          ");
			 //*We gave the Owner the option to return to the beginning of the owner menu or customer menu in case of any mistakes
			
			System.out.println("Enter the owners_pin to return to the beginning of the Owner menu OR Enter Item_code to return to beginning of customer menu. NB:Enter 1 if you'd rather opt out of both!");
			int Owner_response = userInput.nextInt();
			if (Owner_response == 3692){customerMenu();}
			else if (Owner_response == 4812){ownerMenu();}
			 else if(Owner_response == 1) {System.out.println("Thank you for using avenders vending machine.");}
			
			}  //*END OF ownerMenu()
