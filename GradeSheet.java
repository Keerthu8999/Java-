import java.util.Scanner;
import java.io.*;
public class GradeSheet
{
int[] marks=new int[10];
int[] rollno=new int[10];
char[] grades=new char[10];
int max,min,total,average;
public void getMarks()
{
System.out.printf("Enter the mark");
for(int mark:marks)
{
Scanner scan=new Scanner(System.in);
mark=scan.nextInt();
}
}
public void getRollno()
{
System.out.printf("Enter the rollno");
for(int rno:rollno)
{
Scanner scan=new Scanner(System.in);
rno=scan.nextInt();
}
}
public int findMin()
{
int min=marks[0];
for(int i=0;i<marks.length;i++)
{
if(marks[i]<min)
min=marks[i];
}
System.out.println("Minimum: "+min);
return min;
}
public int findMax()
{
for(int i=0;i<marks.length;i++)
{
int max=marks[0];
if(marks[i]>max)
max=marks[i];
}
System.out.println("Maximum: "+ max);
return max;
}
public int findTotal()
{
for(int i=0;i<marks.length;i++)
{
total+=marks[i];
}
System.out.println("Total: "+total);
return total;
}
public int findAverage()
{
for(int i=0;i<marks.length;i++)
{
average=total/10;
}
System.out.println("Average: "+average);
return average;
}
public static void printDetails()
{
for(int i:marks)
{
System.out.printf("%d-->%d marks\n",rollno[i],marks[i]);
}

}
public static void main(String[] args)
{
GradeSheet g1=new GradeSheet();
g1.getMarks();
g1.getRollno();
g1.printDetails();
g1.findMin();
g1.findMax();
g1.findTotal();
g1.findAverage();
}
}








