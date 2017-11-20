/*import java.io.*;
import java.util.Scanner;
public class FirstJava
{
int var1,var2,p1,p2;
String s1,s2;
public FirstJava(int a,int b,String str)
{
var1=a;
var2=b;
s1=str;
System.out.println("The value of var1 is"+var1);
System.out.println("The value of var2 is"+var2);
System.out.println("The string is"+s1);
}
public void getData()
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the values of p1,p2 and s2");
p1=scan.nextInt();
p2=scan.nextInt();
s2=scan.next();
}
public int displayData()
{
System.out.println("The value of p1 is"+p1);
System.out.println("The value of p2 is"+p2);
System.out.println("The string is"+s2);
return 0;
}
public static void main(String []args)
{
FirstJava fj=new FirstJava(4,5,"Keeru");
fj.getData();
fj.displayData();
}
}*/
import java.io.*;
import java.util.Scanner;
class BaseClass
{
int a,b;
public void getData()
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
public class JavaProgram extends BaseClass
{
//super.getData();
public void multiplication()
{
int c;
c=a*b;
System.out.println("The result of multiplication is:"+c);
}
public void division()
{
int c;
c=a/b;
System.out.println("The result of division is:"+c);
}
public static void main(String []args)
{
JavaProgram obj1=new JavaProgram();
obj1.getData();
obj1.addition();
obj1.subtraction();
obj1.multiplication();
obj1.division();
}
}
