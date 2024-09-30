package thisnew;

public class Employee {
String name;
int age;
float salary;
Employee(String name,int age,float salary)
{
	this.name=name;
	this.age=age;
	this.salary=salary;
	
}
public void show()
{
	System.out.println(name);
	System.out.println(age);
	System.out.println(salary);
}
	public static void main(String[] args) {
		Employee obj=new Employee("appu",21,300.00f);
		obj.show();
		// TODO Auto-generated method stub

	}

}
