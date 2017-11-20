import java.io.*;
import java.util.*;
public class Employees
{
String empname;
int empno;
String empdesig;
int salary;
Employees(){}
Employees(String empname,int empno,String empdesig,int salary)
{
this.empname=empname;
this.empno=empno;
this.empdesig=empdesig;
if(salary>15000)
this.salary=salary;
else
throw new IllegalArgumentException("Salary amount too low");
}
public void getDetails()
{
Scanner scan=new Scanner(System.in);
empname=scan.next();
empno=scan.nextInt();
empdesig=scan.next();
salary=scan.nextInt();
}
public String toString()
{
return String.format("%s-->%d-->%s-->%d",empname,empno,empdesig,salary);
}
}
