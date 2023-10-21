package JavaLearnYourSelf;
import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.swing.*;
import java.util.Scanner;
public class ChangeValue {
    public static void main(String[] args) {
        float Celsius;
        float Farenheit=212.0F;
//    Definite c =(5(f-32))/9;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please Input Celsius:");
        Celsius=myObj.nextFloat();
        Celsius=5*(Farenheit - 32) / 9;
        System.out.println("Celsius is :" +Celsius+"\n Farenheit is :" +Farenheit);
    }






//   public static void main(String[] args) {
//       float Celsius=100,Farenheit;
//        Scanner myTemperature =new Scanner(System.in);
//       System.out.println("Please Input value of Farenheit :");
//       Farenheit=myTemperature.nextFloat();
//       Farenheit= (9*Celsius+(32 * 5) / 5);
//        System.out.println("Result of Celsius is :" + Celsius+"C");
//       System.out.println("========================================");
//
//   }
}

