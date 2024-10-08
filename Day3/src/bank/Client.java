package bank;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 4) {
            System.out.println("Select the option:");
            System.out.println("1. Interest Calculator � SB");
            System.out.println("2. Interest Calculator � FD");
            System.out.println("3. Interest Calculator � RD");
            System.out.println("4. Exit");
            option = scanner.nextInt();

            try {
                switch (option) {
                    case 1: 
                    	System.out.println("Enter the Average amount in your account:");
                        double sbAmount = scanner.nextDouble();
                        System.out.println("Enter the type of account (Normal/NRI):");
                        String accountType = scanner.next();
					SBAccount sbAccount = null;
					try {
						sbAccount = new SBAccount(sbAmount, accountType);
					} catch (Userdef e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                        System.out.println("Interest gained: Rs. " + sbAccount.calculateInterest());
                        break;

                    case 2: 
                        System.out.println("Enter the FD amount:");
                        double fdAmount = scanner.nextDouble();
                        System.out.println("Enter the number of days:");
                        int noOfDays = scanner.nextInt();
                        System.out.println("Enter your age:");
                        String age = scanner.next();
					FDaccount fdAccount = null;
					try {
						fdAccount = new FDaccount(fdAmount, noOfDays, age);
					} catch (Userdef e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                        System.out.println("Interest gained is: Rs. " + fdAccount.calculateInterest());
                        break;

                    case 3: 
                        System.out.println("Enter the monthly deposit amount:");
                        double rdAmount = scanner.nextDouble();
                        System.out.println("Enter the number of months:");
                        int noOfMonths = scanner.nextInt();
                        System.out.println("Enter your age:");
                        String rdage = scanner.next();
					RDaccount rdAccount = null;
					try {
						rdAccount = new RDaccount( noOfMonths,rdAmount, rdage);
					} catch (Userdef e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                        System.out.println("Interest gained is: Rs. " + rdAccount.calculateInterest());
                        break;

                    case 4: // Exit
                        System.out.println("Exiting the program.");
                        break;

                    default:
                        System.out.println("Invalid option. Please select a valid option.");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}

