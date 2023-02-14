import java.util.*;

class First{
 	public static void main(String[] args) {
 		Scanner scn=new Scanner(System.in);
		System.out.println("Enter count value");
		int count = scn.nextInt();
		int alfa=65;

 		for (int i=0;i<count ;i++ ) {

 			for (int j=0;j<=i ;j++ ) {
 				
 			System.out.print((char)alfa);
 			alfa++;
 			

 			}

 		alfa=65;
 		System.out.println();

 		}


		
	}
}