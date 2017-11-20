import java.io.*;
import java.util.*;
public class HourlyEmployee extends EmpDetails
{
float wages;
int hours;
public HourlyEmployee(String empname,String empdesig,int empid,int hours,float wages)
{
super(empname,empdesig,empid);
setWages(wages);
setTime(hours);
}
public void setWages(float s)
{
if(s>0.0)
wages=s;
else
throw new IllegalArgumentException("Error!");
}
public float getWages()
{
return wages;
}
public void setTime(int t)
{
if(t<168)
hours=t;
else
throw new IllegalArgumentException("Error!");
}
public int getTime()
{
return hours;
}

public double earnings()
{
return getWages()*getTime();
}
@Override
public String toString()
{
return String.format("%s-->%s-->%s",super.toString(),getWages(),getTime());
}
}
