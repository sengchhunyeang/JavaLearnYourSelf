package JavaLearnYourSelf;
import java.util.Scanner;
public class FindIndexArray {

    public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Scanner myScanner = new Scanner(System.in);
        my_array= new int[]{myScanner.nextInt()};
        /*System.out.println("Index Array is: " + findIndex());*/

    }
}
