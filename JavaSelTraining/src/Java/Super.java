package Java;

 class Animal{
	 //String color ="white";
	 void eat() {
		 System.out.println("eating....");
	 }
}

  class Dog extends Animal{
	  //String color ="black";
	 /* void display() {
		  System.out.println(color);
		  System.out.println(super.color);
	  }*/
	  void eat() {
		  System.out.println("eating bone");
		 
	  }
	  void bark() {
		  System.out.println("barking");
		 
	  }
	  void work() {
		  super.eat();
		  bark();
		 
	  }
	  
	  
	  
  }
public class Super {

	public static void main(String[] args) {
		Dog d = new Dog();
		//d.display();
		d.eat();
		//d.bark();
		d.work();
		
		
		
	}

}
