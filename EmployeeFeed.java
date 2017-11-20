import java.io.*;
public class EmployeeFeed
{
public static void main(String []args)
{
Employee emp1=new Employee();
Employee emp2=new Employee();

//Employee emp1=new Employee("Keeru",15,18,"Student at CEG daww",15000);
//Employee emp2=new Employee("Don",16,19,"Student at MAK daww",25000);
/*emp1.get_empno(15);
emp1.get_age(18);
emp1.get_str("Student at CEG dawww");
emp1.get_salary(25678);

emp2.get_empno(16);
emp2.get_age(19);
emp2.get_str("Student at MAK dawww");
emp2.get_salary(25000);*/
emp1.getDetails();
emp1.printDetails();
emp2.getDetails();
emp2.printDetails();
}
}
