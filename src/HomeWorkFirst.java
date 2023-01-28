import java.sql.Array;
import java.util.Scanner;

public class HomeWorkFirst {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array;
        array = new int[7];

        array[0] = 3;
        array[1] = 6;
        array[2] = 4;
        array[3] = 7;
        array[4] = 2;
        array[5] = 1;
        array[6] = 9;

        //        Level 1

        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Such a number does not exist in the array");
        } else {
            System.out.println("The number index is " + index);
        }

//        Level 2

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i]*array[i];
        }

        System.out.println(sum);



    }
}

