package Java;

public class Array {

	public static void main(String[] args) {
		
		int[] a = new int[10]; // declare and instantiation
		
		//int []b; declaration
		//int c[];
		a[0]=10; // initialization
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		int size = a.length;
		//System.out.println(a[6]);
		
		
	for(int i=0;i<size;i++){
		System.out.println(a[i]);
	}
	}

}
