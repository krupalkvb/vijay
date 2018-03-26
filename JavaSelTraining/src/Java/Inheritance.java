package Java;


class Parent{
	int i= 10;
	void parentProp() {
		System.out.println("parentproperty   " + i);
	}
}

class Child extends Parent{
	int j = 20;
	void childProp() {
		System.out.println("childproperty   "+ j );
	}
}


public class Inheritance {

	public static void main(String[] args) {
		Parent p= new Parent();	
		p.parentProp();
		System.out.println(p.i);
		
		Child c= new Child();
		c.childProp();
		c.parentProp();
		System.out.println(p.i);
		System.out.println(c.j);

	}

}
