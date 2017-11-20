import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.*;
public class ArrayFunction
{
public static void main(String[] args)
{
List<String>names=new ArrayList<String>();
names.add("C");
names.add("C++");
names.add("Java");
names.add("Python");
names.add("Python");
names.add("C");
names.add("C");
System.out.println(names);
System.out.println("\nFinding the duplicate elements");
List<String> tempNames = new ArrayList<String>();
for(String name : names)
{
if(!tempNames.contains(name)) 
{
tempNames.add(name);
}
}        
for(String name : tempNames) 
{
System.out.println(name+" found in "+ Collections.frequency(names, name) +" times");   
}  
List<String>CopyNames=new ArrayList<String>(names);
Collections.copy(CopyNames, names);
System.out.println("Copied ArrayList is"+CopyNames);
}
}      


