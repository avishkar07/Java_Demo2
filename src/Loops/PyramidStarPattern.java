package Loops;

public class PyramidStarPattern {
    public static void main(String[] args) {
        int num=6;
        for (int i =0;i<num;i++){

            for ( int k =num-i;k > 0; k--)
            {
                System.out.print(" ");
            }
            for (int j =1 ;j <=i ; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }
}
