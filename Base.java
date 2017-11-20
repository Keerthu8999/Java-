import java.io.*;
import java.util.*;
public class Base
{
String empname;
int empid;
String empdesig;
float salary;
public Base(){}
public Base(String empname,int empid,String empdesig,float salary)
{
setEmpname(empname);
setEmpid(empid);
setEmpdesig(empdesig);
setEmpsalary(salary);
}
public void setEmpname(String name)
{
empname=name;
}
public String getEmpname()
{
return empname;
}

public void setEmpdesig(String dname)
{
empdesig=dname;
}
public String getEmpdesig()
{
return empdesig;
}

public void setEmpid(int id)
{
empid=id;
}
public int getEmpid()
{
return empid;
}

public void setEmpsalary(float sal)
{
if(sal>15000)
salary=sal;
else
throw new IllegalArgumentException("Salary out of Range");
}
public float getEmpsalary()
{
return salary;
}
public double earnings()
{
float v=getEmpsalary()*5;
System.out.println(v);
return getEmpsalary()*5;
}
public String toString()
{
return String.format("%s-->%d-->%s-->%f",getEmpname(),getEmpid(),getEmpdesig(),getEmpsalary());
}
}
