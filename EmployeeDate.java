import java.io.*;
import java.util.*;
public class EmployeeDate
{
public static void main(String[] args)
{
Date doo=new Date(5,3,98);
System.out.println(doo);
Employe e1=new Employe("Keeru",15,"App Developer",doo);
System.out.println(e1);
/*try
{
Date d1=new Date(32,5,87);
}
catch(IllegalArgumentException e)
{
System.out.printf("Error %s",e.getMessage());
}*/

}
}
