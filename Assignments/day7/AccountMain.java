/*
Create a program that helps banks to maintain records.
 It should have following facilities.
 o Anybody can create current or saving account with following initial information: account number, name, balance, and branch.
 o display account detail for a particular accounts.
 o display total money deposited in bank.
 o allow deposit and  withdrawal in an account.
 o for saving account opening balance and minimum balance must be 5000.
 o for current account opening balance and minimum balance must be 1000.
 o can not withdraw the amount from the account that makes balance less than the minimum balance. 
*/

import java.util.Scanner;
class CurrentAccount {

	private int accntno;
	private String name;
	private float balance;
	
	CurrentAccount(){}

	CurrentAccount(int accntno, String name, float balance){
		this.accntno = accntno;
		this.name = name;
		this.balance = balance;
	}
	public void DsiplayCA(){
		System.out.println("Account number: "+this.accntno+" Account holder's Name: "+this.name+" Balance Amount: "+this.balance);
	}
	
	public void WithdrawCA(float balance){
		if( (this.balance - balance) <1000F){
			System.out.println("Your balance is lower than minimum balance: ");
			System.out.println("You can only withdraw: "+(this.balance - 1000F));
		}else{
		
		System.out.println("Amount "+balance+" has been deducted from main balance, New balance is: "+(this.balance - balance) );
		this.balance-= balance;
		}
	}
	
	public void DepositeCA( float balance){
				System.out.println("Account number: "+this.accntno+"Amount "+balance+" has been credited , New balance is: "+(this.balance + balance) );
		this.balance += balance;
	}

}

class SavingAccount {
	
	
	private int accntno;
	private String name;
	private float balance;
	
	SavingAccount(){}

	SavingAccount(int accntno, String name, float balance){
		this.accntno = accntno;
		this.name = name;
		this.balance = balance;
	}
	public void DsiplaySA(){
		System.out.println("Account number: "+this.accntno+" Account holder's Name: "+this.name+" Balance Amount: "+this.balance);
	}
	
	public void WithdrawSA(float balance){
		if( (this.balance - balance) <5000F){
			System.out.println("Your balance is lower than minimum balance: ");
			System.out.println("You can only withdraw: "+(this.balance - 1000F));
		}else{
		
		System.out.println("Amount "+balance+" has been deducted from main balance, New balance is: "+(this.balance - balance) );
		this.balance-= balance;
		}
	}
	
	public void DepositeSA( float balance){
				System.out.println("Account number: "+this.accntno+"Amount "+balance+" has been credited , New balance is: "+(this.balance + balance) );
		this.balance += balance;
	}


}

class AccountMain{
	
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice: ");
		System.out.println("1. Saving Account: ");
		System.out.println("2. Current Account: ");
		int chc = sc.nextInt();
		
			System.out.println("Enter account no: ");
			int acnt = sc.nextInt();
			System.out.println("Enter name: ");
			String name = sc.next();
			
			CurrentAccount ca = new CurrentAccount();
			SavingAccount sa = new SavingAccount();
			 
		
		switch(chc){
			
			
			case 1: 
					System.out.println("Enter Amount: ");
					float amnt = sc.nextFloat();
					if(amnt < 5000F){
						System.out.println("Amount cannot be less than 5000");
						System.out.println("Please enter again: ");
						amnt = sc.nextFloat();
					}else{
						System.out.println("Valid amount");
					}	
					
					//CurrentAccount ca = new CurrentAccount(acnt, name, amnt);
					ca.CurrentAccount(acnt, name, amnt);
					ca.DsiplayCA();
					
					break;
					
			case 2: 
					System.out.println("Enter Amount: ");
					float amnt = sc.nextFloat();
					if(amnt < 1000F){
						System.out.println("Amount cannot be less than 5000");
						System.out.println("Please enter again: ");
						amnt = sc.nextFloat();
						
					}else{
						System.out.println("Valid amount");
					}	
					
					SavingAccount sa = new SavingAccount(acnt, name, amnt);
					sa.DsiplayCA();
					
					break;
		}
		
		
			
				boolean flag = true;
				while(flag){
				System.out.println("1. to withdraw ");
				System.out.println("2. to Deposite: ");
				System.out.println("3. to exit: ");
				int ch =sc.nextInt();
		
				switch(ch){
				case 1:
					System.out.println("Enter Amount: ");
					float withdraw = sc.nextFloat();
					ca.WithdrawCA(withdraw);
					break;
					
				case 2:
					System.out.println("Enter Amount: ");
					float credit = sc.nextFloat();
					ca.DepositeCA(credit);
					break;
					
				case 3:
					flag =false;
					break;

				}
				
			}
		
		
		
		
		
		
		//ca.DsiplayCA();
		//Transaction();
		
		 
		
		
		
	}
	
	
}