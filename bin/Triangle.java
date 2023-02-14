import java.util.*;

class Triangle{

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the count value");
		int count=scn.nextInt();

		for (int i=0;i<count ;i++ ) {

			for (int j=0;j<=i ;j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}