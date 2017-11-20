import java.io.*;
import java.util.*;
public class Time
{
int hour;
int minute;
int second;
Time(){}
Time(int h,int m,int s)
{
if((h<0||h>=24)||(m<0||m>60)||(s<0||s>60))
{
throw new IllegalArgumentException("Out of range");
}
else
{
hour=h;
minute=m;
second=s;
}
}
Time(Time t)
{
this(t.getHour(),t.getMinute(),t.getSecond());
}
public void setHour(int h)
{
if(h>0&&h<=24)
hour=h;
else
throw new IllegalArgumentException("Out of Range");
}
public void setMinute(int m)
{
if(m>0&&m<60)
minute=m;
else
throw new IllegalArgumentException("Out of Range");
}
public void setSecond(int s)
{
if(s>0&&s<60)
second=s;
else
throw new IllegalArgumentException("Out of Range");
}
public int getHour()
{
return hour;
}
public int getMinute()
{
return minute;
}
public int getSecond()
{
return second;
}
public void setTime(int h,int m,int s)
{
setHour(h);
setMinute(m);
setSecond(s);
}
public String toString()
{
return String.format("%d:%d:%d",getHour(),getMinute(),getSecond());
}
public String toUniversalString()
{
return String.format("%d:%d:%d",hour,minute,second);
}
}

