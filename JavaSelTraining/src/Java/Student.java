package Java;

public class Student {
	
	
	int studentid = 10;
	String name ="tippu";
	//String name;
	
	void sum(int x,int y){
		int z=x+y;
		System.out.println("Marks = "+z);
	}

	public static void main(String[] args) {
	
		Student s =new Student();
		
		System.out.println("ID :  " + s.studentid);
		System.out.println("NAME :  " +s.name);
		s.sum(4, 5);
		
	}

}
