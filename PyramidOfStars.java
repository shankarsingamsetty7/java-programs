import java.util.*;

class PyramidOfStars{

    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            
            //for loop to print spaces
            for (int j=n-i;j>1;j--) {

                System.out.print(" ");
            }

            //for loop to print stars
            for (int j=0;j<=i;j++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}