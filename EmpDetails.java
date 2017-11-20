import java.io.*;
import java.util.*;
public abstract class EmpDetails implements Payable
{
String empname;
String empdesig;
int empid;
public EmpDetails(){}
public EmpDetails(String empname,String empdesig,int empid)
{
this.empname=empname;
this.empdesig=empdesig;
this.empid=empid;
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

//public abstract double earnings();
@Override
public String toString()
{
return String.format("%s-->%s-->%s",getEmpname(),getEmpdesig(),getEmpid());
}
}


