import java.io.*;
import java.util.Scanner;
public class Complexx
{
int real,imag;
public Complexx()
{}
public Complexx(int r,int i)
{
real=r;
imag=i;
}
public Complexx add(Complexx c1,Complexx c2)
{
this.real=c1.real+c2.real;
this.imag=c1.imag+c2.imag;
return this;
}
public Complexx subtract(Complexx c1,Complexx c2)
{
this.real=c1.real-c2.real;
this.imag=c1.imag-c2.imag;
return this;
}
@Override
public String toString()
{
return String.format(real + " + i" + "("+ imag +")");
}
public static void main(String[] args)
{
Complexx cmp1=new Complexx(1,2);
Complexx cmp2=new Complexx(2,3);
Complexx cmp3=new Complexx();
Complexx cmp4=new Complexx();
cmp3.add(cmp1,cmp2);
cmp4.subtract(cmp1,cmp2);
System.out.println(cmp1);
System.out.println(cmp2);
System.out.println(cmp3+"is addition result");
System.out.println(cmp4+"is subtraction result");
}
}

