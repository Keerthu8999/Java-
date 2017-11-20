import java.io.*;
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
}
