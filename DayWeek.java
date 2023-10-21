package JavaLearnYourSelf;

import java.util.Scanner;
public class DayWeek {

    public static void main(String[] args) {
        int inputNum;
        Scanner myNum = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Please Input day Do you want :");
        inputNum=myNum.nextInt();
        switch(inputNum){
            case 1:
                System.out.println(inputNum+"This is monday");
                break;
            case 2:
                System.out.println(inputNum+"This is Tuesday ");
                break;
            case 3:
                System.out.println("Today is Wednesday ");
                break;
            case 4:
                System.out.println("Today is Thursday ");
                break;
            case 5:
                System.out.println("Today is Friday ");
                break;
            case 6:
                System.out.println("Today is Saturday ");
            case 7:
                System.out.println("Today is Sunday ");
                break;
            default:
                System.out.println("Your information not Correct ");
        }

    }
}
