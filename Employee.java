import java.io.*;
import java.util.Scanner;
public class Employee
{
int empno;
String name;
int age;
String desig;
int salary;
/*public void get_empno(int emp_no)
{
empno=emp_no;
}*/
public Employee()
{}
public void getDetails()
{
Scanner scan=new Scanner(System.in);
System.out.println("ENter the details");
empno=scan.nextInt();
name=scan.next();
age=scan.nextInt();
desig=scan.next();
salary=scan.nextInt();
}
/*public void get_age(int a)
{
age=a;
}
public void get_str(String empdesig)
{
desig=empdesig;
}
public void get_salary(int emp_salary)
{
salary=emp_salary;
}*/
public void printDetails()
{
System.out.println("Employee No:"+empno);
System.out.println("Employee Name:"+name);
System.out.println("Age:"+age);
System.out.println("Designation:"+desig);
System.out.println("Salary:"+salary);
}
}
