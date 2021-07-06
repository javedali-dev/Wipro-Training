/*Write a program to print month in words, based on input month in numbers
        Example1:
        C:\>java Sample 12
        O/P Expected : December

        Example2:
        C:\>java Sample
        O/P Expected : Please enter the month in numbers

        Example3:
        C:\>java Sample 15
        O/P Expected : Invalid month
*/
package milestone1.javaFundamentals.switchStatement;

public class PrintMonthInWords {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
}
