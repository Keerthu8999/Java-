import java.io.*;
import java.util.Scanner;
class BaseClass
{
int a,b;
public void getdata()
{
System.out.println("Enter the details");
Scanner scan=new Scanner(System.in);
a=scan.nextInt();
b=scan.nextInt();
}
public void addition()
{
int c;
c=a+b;
System.out.println("The result of addition is:"+c);
}
public void subtraction()
{
int c;
c=a-b;
System.out.println("The result of subtraction is:"+c);
}
}
public class JavaProgr extends BaseClass
{
super.BaseClass();
public void multiplication()
{
int c;
c=a*b;
System.out.println("The result of addition is:"+c);
}
public void division()
{
int c;
c=a/b;
System.out.println("The result of addition is:"+c);
}
public static void main(String []args)
{
JavaProgr obj1;
obj1.getdata();
obj1.addition();
obj1.subtraction();
obj1.multiplication();
obj1.division();
}
}
