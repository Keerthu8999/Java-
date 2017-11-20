import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class ArrayFunctions
{
public static void main(String[] args)
{
System.out.println("Enter the strings in a sequential manner");
Scanner scan=new Scanner(System.in);
String input=scan.nextLine();
String[] names=input.split(" ");
Map<String,String> obj1 = new HashMap<String,String>();               
Map<String,String> obj2 = new HashMap<String,String>();
ArrayList<Object> myObject = new ArrayList<Object>();
ArrayList<Object> myTempObject = new ArrayList<Object>();
for(int i=0;i<names.length;i++)
{
String word=names[i].toLowerCase();
if(obj1.get(word)!=null)
{
if(obj2.get(word)==null)
{
System.out.println("Repeated Word is"+word);
obj2.put(word,word);
}
}
else
{
obj1.put(word,word);
}
}
Collections.copy(myTempObject,obj1);
System.out.println(myTempObject);
}
}
