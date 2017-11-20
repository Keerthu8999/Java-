import java.io.*;
import java.util.*;
public class TimeTest
{
public static void main(String[] args)
{
Time t1=new Time();
Time t2=new Time(4,3,6);
//System.out.println(t2);
Time t3=new Time();
t3.setHour(13);
t3.setMinute(3);
t3.setSecond(8);
//System.out.println(t3);
Time t5=new Time(t3);
try
{
Time t4=new Time(25,67,89);
}
catch(IllegalArgumentException e)
{
System.out.printf("Error!!! %s",e.getMessage());
}
System.out.printf("%s\n",t1.toUniversalString());
System.out.printf("%s\n",t1.toString());

System.out.printf("%s\n",t2.toUniversalString());
System.out.printf("%s\n",t2.toString());

System.out.printf("%s\n",t3.toUniversalString());
System.out.printf("%s\n",t3.toString());

System.out.printf("%s\n",t5.toUniversalString());
System.out.printf("%s\n",t5.toString());


}
}
