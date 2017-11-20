import java.io.*;
import java.util.*;
public class SalariedEmployee extends EmpDetails
{
double salary;
public SalariedEmployee(String empname,String empdesig,int empid,double salary)
{
super(empname,empdesig,empid);
setSalary(salary);
}
public void setSalary(double s)
{
if(s>15000)
salary=s;
else
throw new IllegalArgumentException("Salary out of Range!!");
}
public double getSalary()
{
return salary;
}
/*@Override
public double earnings()
{
return getSalary();
}*/
@Override
public double payment()
{
return getSalary();
}
@Override
public String toString()
{
return String.format("%s\n %s",super.toString(),getSalary());
}
}

