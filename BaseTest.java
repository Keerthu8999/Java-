import java.io.*;
import java.util.*;
public class BaseTest
{
public static void main(String[] args)
{
Base b=new Base("Keeru",19,"Software Tester",16000);
System.out.println(b);
Derived d=new Derived("Sunder",18,"Auditor",19000,5,0.6);
System.out.println(d);
Base b1=d;
System.out.println(b1);
try
{
Derived d1=new Derived("Heya",16,"Auditor",19000,5,1.6);
}
catch(IllegalArgumentException e)
{
System.out.printf("Error %s",e.getMessage());
}

}
}
