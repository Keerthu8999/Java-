import java.io.*;
import java.util.*;
public class Employe
{
String empname;
int empid;
String empdesig;
Date birth;
public Employe(String empname,int empid,String empdesig,Date birth)
{
this.empname=empname;
this.empid=empid;
this.empdesig=empdesig;
this.birth=birth;
}
public String toString()
{
return String.format("%s-->%s-->%s-->%s",empname,empid,empdesig,birth);
}
}
