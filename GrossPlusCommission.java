import java.io.*;
import java.util.*;
public class GrossPlusCommission extends SalariedEmployee
{
int grossSales;
double commissionRate;
public GrossPlusCommission(String empname,String empdesig,int empid,double salary,int grossSales,double commissionRate)
{
//super.SalariedEmployee();
super(empname,empdesig,empid,salary);
setGrossSales(grossSales);
setCommission(commissionRate);
}
public void setGrossSales(int gs)
{
if(gs>0)
grossSales=gs;
else
throw new IllegalArgumentException("Gross out of range");
}
public int getGrossSales()
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
return ((getGrossSales()*getCommission())+super.earnings());
}
@Override
public String toString()
{
return String.format("%s-->%s-->%s",super.toString(),getGrossSales(),getCommission());
}
}
