import java.io.*;
import java.util.Scanner;
public class Rational
{
double num,den;
double max;
public Rational()
{}
public void getValue()
{
System.out.println("Enter the two rational numbers");
num=scan.nextInt();
den=scan.nextInt();
public void addNum(Rational r1,Rational r2)
{
this.num=r1.num+r2.num;
return this;
}
public void lcm(Rational r1,Rational r2)
{

max=(r1.den>r2.den)?r1.den:r2.den;
while(true)
{
if((max%r1.den==0)&&(max%r2.den==0))
{
System.out.println(max);
}
else
{
++max;
}
}
}
public void printRational()
{
System.out.println(num+'/'+max);
}
public static void main(String[] args)
{
Rational rat1=new Rational();
Rational rat2=new Rational();
rat1.getdata();
rat2.getdata();
Rational rat3=new Rational();
rat3.addNum(rat1,rat2);
rat3.lcm(rat1,rat2);
rat3.printRational();
}
}

