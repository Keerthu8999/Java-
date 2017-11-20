import java.io.*;
import java.util.Scanner;
public class RationalTest
{
public static void main(String[] args)
{
Rational rat1=new Rational();
Rational rat2=new Rational();
rat1.getValue();
rat2.getValue();
try
{
rat1.getden();
rat2.getden();
}
catch(IllegalArgumentException e)
{
System.out.println("Denominator cannot be zero");
}
Rational rat3=new Rational();
Rational rat4=new Rational();
rat3.add(rat1,rat2);
rat4.subtract(rat1,rat2);
rat1.printRat();
rat2.printRat();
System.out.println(rat3);
System.out.println(rat4);
}
}
