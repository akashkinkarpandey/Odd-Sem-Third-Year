import java.io.*;
class Bank
{
String name;
char type;
String account;
int balance;
int overdraft;
Bank(String name,char type,String account,int balance)
{
this.name=name;
this.type=type;
this.account=account;
this.balance=balance;
this.overdraft=0;
}
void withdraw(int amount)
{
	if(type=='S')
	{
		if(balance-amount>=1000)
			balance=balance-amount;
		else
			System.out.println("Unable to withdraw from Savings");
	}
	else
	{
		if(balance<0)
		{
			System.out.print("Unable to withdraw from current account ");
			System.out.println(" as there is an overdraft of "+overdraft);
		}
		else
		{
			balance=balance-amount;
			if(balance<0)
				overdraft=-balance;
		}
	}
}
void deposit(int amount)
{
	balance+=amount;
}
int checkBalance()
{
	return balance;
}
}
class BankAccount
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		while(1==1)
		{
			System.out.println("Keep entering new user date. Press 0 to continue.Press 1 to exit");
			int tt=Integer.parseInt(br.readLine());
			if(tt==1)
				break;
			else if(tt!=0)
			{
				System.out.println("Wrong input..Enter again");
				continue;
			}
			System.out.println("Enter account type- C for Current, S for Savings");
			char type=(char)br.read();
			System.out.println("Enter account holder name");
			String name=br.readLine();
			System.out.println("Enter account number");
			String account=br.readLine();
			System.out.println("Enter amount to be put");
			int balance=Integer.parseInt(br.readLine());
			Bank b=new Bank(name,type,account,balance);
			System.out.println("Account holder's name is "+b.name);
			if(type=='C')
				System.out.println("Account holder's account type is Current");
			else 
				System.out.println("Account holder's account type is Savings ");
			System.out.println("Account holder's account number is "+b.account);
			while(1==1)
			{
				
				System.out.println("Account holder's balance is "+b.balance);
				System.out.println("Account holder's overdraft is "+b.overdraft);
				System.out.println("To continue with same user press 1 else press 2 to create a new user's account");
				int choice=Integer.parseInt(br.readLine());
				if(choice==2)
				{
					break;
				}
				else if(choice!=1)
				{
					System.out.println("Wrong input...");
					continue;
				}
				System.out.println("Press 1 withdraw,2 to deposit,3 to check balance");
				choice=Integer.parseInt(br.readLine());
				if(choice==1)
				{
					System.out.println("Enter amount to withdraw");
					int amt=Integer.parseInt(br.readLine());
					b.withdraw(amt);
				}
				else if(choice==2)
				{
					System.out.println("Enter amount to deposit");
					int depo=Integer.parseInt(br.readLine());
					b.deposit(depo);
				}
				else if(choice==3)
				{
					System.out.println("Balance is "+b.checkBalance());
				}
				else
				{
					System.out.println("Wrong input...");
				}
			}
		}
	}
}
