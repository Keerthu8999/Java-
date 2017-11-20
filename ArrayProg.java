import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class ArrayProg
{
public static void main(String[] args)
{
int[] array=new int[10];
int[] frequency=new int[10];
Random randomNumbers=new Random(); 
for(int i=0;i<array.length;i++)
{
Scanner scan=new Scanner(System.in);
array[i]=scan.nextInt();
}
for(int i=0;i<array.length;i++)
{
++frequency[1 + randomNumbers.nextInt(9)];
}
for(int i=0;i<array.length;i++)
{
System.out.println(array[i]+frequency[i]);
}
}
}
