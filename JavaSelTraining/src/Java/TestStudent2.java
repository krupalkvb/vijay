package Java;

class StudentEx1{
	int studentid;
	String name;
	
	void insertRecord(int id,String nameee) {
		
		studentid =id;
		name =nameee;
		
		
	}
	 void display(){
		 System.out.println(studentid);
			System.out.println(name);
	 }
	
     	
}

public class TestStudent2 {

	public static void main(String[] args) {
		StudentEx1 s1= new StudentEx1();
		StudentEx1 s2= new StudentEx1();
		StudentEx1 s3= new StudentEx1();
		s1.insertRecord(101, "vijay");
		s2.insertRecord(102,"beney");
		s3.insertRecord(103,"krupal");
		s2.display();
		
		
	}

}
