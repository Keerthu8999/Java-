import java.io.*;
import java.util.Scanner;
public class Rational
{
public double num,den,max,gcd;


public void getValue()
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the rational number");
num=scan.nextInt();
den=scan.nextInt();
}
public Rational()
{

}
public double getden()
{
if (den==0)
{
throw new IllegalArgumentException("cannot be zero");
}
return den;
}
public Rational add(Rational r1,Rational r2)
{
//double greatdenom = r1.den * r2.den;       
//double multx = greatdenom / r1.den;
//double mult = greatdenom / r2.den;
this.den = r1.den * r2.den;
this.num = (r1.num * r2.den) + (r2.num * r1.den);
return this;
}
public Rational subtract(Rational r1,Rational r2)
{
double greatdenom = r1.den * r2.den;       
double multx = greatdenom / r1.den;
double mult = greatdenom / r2.den;
this.den = r1.den * r2.den;
this.num = (r1.num * multx) - (r2.num * mult);
return this;
}
@Override
public String toString()
{
return String.format("The rational Number is"+num+'/'+den);
}
public void printRat()
{
System.out.println("The Rational number is"+num+'/'+den);
}
}

