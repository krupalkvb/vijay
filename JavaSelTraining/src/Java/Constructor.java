package Java;

public class Constructor {
	int id;
	String name;
	
	Constructor(){
		id=101;
		name ="eva";
	}
	
	void display() {
		
		System.out.println("id is :" + id);
		System.out.println("name is :" + name);
	}
	
	public static void main(String[] args) {
		
		Constructor c= new Constructor();
		Constructor c1= new Constructor();
		c.display();
		c1.display();
	}

}
