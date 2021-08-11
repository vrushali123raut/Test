package pkg2;

import pkg1.Account;

/*public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		int account_number=20;
		int account_balance=100;
		account_balance=account_balance+100;
		System.out.println("account_balance "+account_balance);
		printf(“Account Number=%d,account_number);
	}

	
}*/
 /*class Account{
 public static void main(String[] args) {
	 Account1 a=new Account1();
 	a.showdata();	
 }
 }*/
 class Account1{
     int account_number=100;
     int account_balance=200;
     public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public int getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(int account_balance) {
		this.account_balance = account_balance;
	}
	
	public static void main(String[] args) {
    	 Account a=new Account();
    	 
     	a.showdata();	
     	}
	
    
}
