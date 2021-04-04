import java.util.Scanner;

public class MinimumMaximum3Number13 {

    public static void main(String[] args) {

        int[] numbers;
        numbers = new int[3];
        int smallest = numbers[0], largest = numbers[0];

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter 3 numbers: \n");

        for (int counter = 0; counter < numbers.length; counter++) {
            numbers[counter] = input.nextInt();
        }
        for (int i=0 ;i< numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("largest number is "+largest);
        System.out.println("smallest number is "+smallest);

    }

}


