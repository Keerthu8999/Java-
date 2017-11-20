import java.io.*;
import java.util.*;
public class PayableTest
{
public static void main(String[] args)
{
Payable[] payableArray=new Payable[4];
//payableArray[0]=new GroceryDetails("Food",1,2,15.5);
//payableArray[1]=new GroceryDetails("Foodiee",11,21,19.5);
payableArray[2]=new SalariedEmployee("Keeru","App Developer",15,16000);
payableArray[2]=new SalariedEmployee("Kiddo","Developer",19,18000);
for(Payable currentPayable:payableArray)
{
System.out.printf("%s\n",currentPayable.toString());
System.out.printf("%f\n",currentPayable.payment());
}
}
}


