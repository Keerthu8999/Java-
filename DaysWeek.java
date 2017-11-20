class Days
{
enum DaysOfTheWeek{Sun,Mon,Tue,Wed,Thu,Fri,Sat};
DaysOfTheWeek day;
}
public class DaysWeek
{
public static void main(String []args)
{
Days d=new Days();
d.day=Days.DaysOfTheWeek.Tue;
System.out.println("Day:" + d.day);
}
}
