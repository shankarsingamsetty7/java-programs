import java.util.*;

class ReverseTriangle{

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);

		int count=scn.nextInt();

		for (int i=0;i<count ;i++ ) {
			
			for (int space=0;space<count-i-1 ;space++ ) {
				System.out.print(" ");
			}
			for (int j=0;j<=i ; j++) {
				

				System.out.print("*");
				
			}

			System.out.println();

		}
	}
}