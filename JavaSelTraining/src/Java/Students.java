package Java;

class Student1{
	int studentid;
	String name;
	
}
class Student2{
	int studentid =777;
	String name = "vijay";
	
}


public class Students {

	public static void main(String[] args) {
		
        Student1 s1 = new Student1();
        System.out.println(s1.studentid);
        System.out.println(s1.name);
        Student2 s2 =new Student2();
        System.out.println(s2.studentid);
        System.out.println(s2.name);
        
	}

}
