package Java;

public class ParaCons {
	int id;
	String name;
	
	ParaCons(int k, String n){
		
		id=k;
		name=n;
		
	}

void display() {
		
		System.out.println("number is :" + id);
		System.out.println("peru is :" + name);
	}
	public static void main(String[] args) {
		
		ParaCons p =new ParaCons(1, "nis");
		ParaCons p1 =new ParaCons(2, "evasd");
		p.display();
		p1.display();
	}

}
