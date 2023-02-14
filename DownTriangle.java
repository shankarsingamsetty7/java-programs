import java.util.*;

class DownTriangle{

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);

		System.out.println("enter the count value");
		int count=scn.nextInt();

		for (int i=0;i<count ;i++ ) {

			for (int j=0;j<count-i ;j++ ) {

				System.out.print("*");
				
			}
			
			System.out.println();
		}
	}
}