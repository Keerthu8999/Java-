import java.io.*;
import java.util.*;
public class Derived extends Base
{
double grossSales;
double commissionRate;
public Derived(){}
public Derived(String empname,int empid,String empdesig,float salary,double grossSales,double commissionRate)
{
super(empname,empid,empdesig,salary);
setGrossSales(grossSales);
setCommission(commissionRate);
}
public void setGrossSales(double gs)
{
if(gs>0)
grossSales=gs;
else
throw new IllegalArgumentException("Gross out of range");
}
public double getGrossSales()
{
return grossSales;
}

public void setCommission(double cr)
{
if(cr<1)
commissionRate=cr;
else
throw new IllegalArgumentException("CR out of range");
}
public double getCommission()
{
return commissionRate;
}

@Override
public double earnings()
{
double v=getGrossSales()*getCommission()*super.earnings();
System.out.println(v);
return getGrossSales()*getCommission()*super.earnings();
}
@Override
public String toString()
{
return String.format("%s-->%s\n%s %s\n","Base-class",super.toString(),getGrossSales(),getCommission());
}
}
