import java.util.Scanner;

public class NaturalNumber6 {


    public static void main(String[] args) {

        int num, count, total = 0;


        System.out.println("Enter the value of n:");

        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        scan.close();
        for(count = 1; count <= num; count++){
            total = total + count;
        }

        System.out.println("Sum of first "+num+" natural numbers is: "+total);
    }
}
