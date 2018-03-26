package Java;

public class MethOver {
	
	
	
	void sum(int a,int b) {
		
		System.out.println(a+b);
	}

	void sum(int x,int y, int z) {
		
		System.out.println(x+y+z);
	}

	void sum(int a, float b) {
		
		System.out.println(a+b);
	}



	public static void main(String[] args) {
		
		MethOver m=new MethOver();
		m.sum(6, 8);
		m.sum(5, 7.5f);
		m.sum(3, 5, 8);
	}

}
