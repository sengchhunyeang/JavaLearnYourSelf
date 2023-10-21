package JavaLearnYourSelf;
import java.util.Scanner;
public class FarenheitDemo {
    public static void main(String[] args) {
        float Farenheit=212.0F;
        float Celsius=100.0F;

        String F ="F";
        String C="C";
        Scanner myTemperature = new Scanner(System.in);
        System.out.println("Please Input Temperature of Farenheit ");
        Farenheit=myTemperature.nextFloat();
        Farenheit= (9*Celsius+(32*5)) / 5;

        System.out.println("Celsius  is : " + Celsius +"C");

    }
}
