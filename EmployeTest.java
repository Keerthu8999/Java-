import java.io.*;
import java.util.*;
public class EmployeTest
{
public static void main(String[] args)
{
SalariedEmployee se=new SalariedEmployee("Keeru","Developer",18,17000);
System.out.println(se);
HourlyEmployee he=new HourlyEmployee("Keeru","Developer",18,3,50);
System.out.println(he);
GrossPlusCommission gpc=new GrossPlusCommission("Keeru","Developer",18,17000,60,0.5);
System.out.println(gpc);
try
{
GrossPlusCommission gpc1=new GrossPlusCommission("Keeru","Developer",18,17000,60,1.5);
}
catch(IllegalArgumentException e)
{
System.out.printf("%s",e.getMessage());
}
try
{
SalariedEmployee se1=new SalariedEmployee("Keeru","Developer",18,10000);
}
catch(IllegalArgumentException e)
{
System.out.printf("%s",e.getMessage());
}
}
} 

