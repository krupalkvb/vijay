package Java;

class StudentEx{
	int studentid;
	String name;
}



public class TestStudent1 {

	public static void main(String[] args) {
		
		StudentEx s1 =new StudentEx();
		s1.studentid =10;
		s1.name = "beney";
		StudentEx s2 = new StudentEx();
		s2.name = "krupal";
		s2.studentid =20;
		System.out.println(s1.studentid);
        System.out.println(s1.name);
        System.out.println(s2.studentid);
        System.out.println(s2.name);
	}

}
