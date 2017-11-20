import java.io.*;
import java.util.*;
public class Date
{
int date;
int month;
int year;
static final int[] maxDays={0,31,28,31,30,31,30,31,31,30,31,30,31};
public int checkMonth(int m)
{
if(m<=12)
return m;
else
throw new IllegalArgumentException("Month out of range");
}
public int checkDays(int d)
{
if(d<=maxDays[month])
return d;
throw new IllegalArgumentException("out");
}
public Date(int date,int month,int year)
{
this.date=checkDays(date);
this.month=checkMonth(month);
this.year=year;
}
public String toString()
{
return String.format("%s/%s/%s",date,month,year);
}
}


