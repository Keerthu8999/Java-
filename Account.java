import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class Account
{
public int acc_no;
public String first_name;
public String last_name;
public double balance,p,n,r;
public Account()
{}
public Account(int a,String f,String l,double b)
{
acc.no=a;
first_name=f;
last_name=l;
balance=b;
}
public void getInterestData()
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the Principal,Rate and no.of years");
p=scan.nextInt();
n=scan.nextInt();
r=scan.nextInt();
}
public double compoundInterest()
{
double inte;
inte=p*Math.pow(1+(r/100),n);
System.out.println("Compound Interest is"+inte);
}
}
public class SavingsAccount extends Account
{
super.Account();
public void findMinBalance()
{
if(balance<5000)
balance=balance-100;
System.out.println("balance is"+balance);
}
public void calculateInterest()
{
double inter;
inter=(p*n*r)/100;
System.out.println("Simple Interest is"+inter); 
}
}
public class CurrentAccount extends Account
{
super.Account();




