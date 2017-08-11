package looping.test;

import java.util.Scanner;

public class LoopingScannerConditionTest_5 {

	static void display(String text){
		System.out.println(text);
	}
	
	
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run){
			display("---------------------------------------");
			display("- 1. Deposit\n- 2. Withdraw\n- 3. Balance\n- 4. Quit");
			display("---------------------------------------");
			System.out.print("Choose : ");
			int input = 0;
			int menuSelected = sc.nextInt();
			
			switch(menuSelected) {

				case 1: {
					System.out.print("\nDeposit : ");
					
					if( (input = sc.nextInt()) >= 1000 ){
						balance += input;
					} else display("Deposit Should be more than 1000 !");
					break;
				}
				case 2: {
					System.out.print("\nWithdraw : ");
					if( (input = sc.nextInt()) > 0) {
						balance -= input;
					} else display("Withdraw should be more than 0 !");
					break;
				}
				case 3: {
					display("\nBalance : " + balance);
					break;
				}
				case 4: {
					display("Programme Finished !");
					run = false;
				}
				default : continue;
			}
			
		}
	}

}
