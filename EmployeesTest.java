import java.io.*;
import java.util.*;
public class EmployeesTest
{
public static void main(String[] args)
{
Employees e1=new Employees();
e1.getDetails();
System.out.println(e1);
try
{
Employees e2=new Employees("Don",9,"App Developer",14000);
}
catch(IllegalArgumentException e)
{
System.out.printf("Error %s",e.getMessage());
}
Employees e3=new Employees("Keeru",19,"Software Tester",16000);
System.out.println(e3);
}
}
