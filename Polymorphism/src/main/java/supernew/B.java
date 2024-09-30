package supernew;

class B extends A{
String name="ammu";
public void show()
{
	System.out.println(super.name);
	System.out.println(name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
B obj=new B();
obj.show();
	}

}
