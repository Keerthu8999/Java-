public class SampleHey
{
private static SampleHey s=new SampleHey();
private SampleHey()
{
}
public static SampleHey getValue()
{
return s;
}
}
public static void main(String []args)
{
SampleHey obj= SampleHey.getValue();
}

