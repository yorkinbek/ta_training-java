import java.util.Scanner;


 class Month {
    public static void main(String[] args) {
        System.out.println("Enter number from 1 to 12 :");
        Scanner month = new Scanner(System.in);
        int day = month.nextInt();



        switch (day){
            case 1:
                System.out.println("January 1");
                break;
            case 2:
                System.out.println("February 2");
                break;
            case 3:
                System.out.println("March 3");
                break;
            case 4:
                System.out.println("April 4");
                break;
            case 5:
                System.out.println("May 5");
                break;
            case 6:
                System.out.println("June 6");
                break;
            case 7:
                System.out.println("July 7");
                break;
            case 8:
                System.out.println("August 8");
                break;
            case 9:
                System.out.println("September 9");
                break;
            case 10:
                System.out.println("October 10");
                break;
            case 11:
                System.out.println("November 11");
                break;
            case 12:
                System.out.println("December 12");
                break;
            default:
                System.out.println("Please enter only numbers:");
        }
    }
}
