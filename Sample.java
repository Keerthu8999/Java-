public class Sample
{
private static Sample s=new Sample();
private Sample()
{}
public static Sample getValue()
{
return s;
}
}

