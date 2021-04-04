import java.util.Scanner;

public class PrintAny10Number1 {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int result;
        do {
            System.out.println("Print Any 10 Numbers :- ");
            result = in.nextInt();
        } while(result < 1|| result > 100);

        System.out.println("correct "+ result);

}
}
