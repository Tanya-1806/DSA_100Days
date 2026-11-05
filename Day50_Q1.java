// Q99 (Strings)
// Change the date format from dd/04/yyyy to dd-Apr-yyyy.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date in dd/MM/yyyy format: ");
        String date = sc.nextLine();
        String[] parts = date.split("/");
        if (parts.length == 3) {
            String day = parts[0];
            String month = parts[1];
            String year = parts[2];
            String monthName = "";
            switch (month) {
                case "01": monthName = "Jan"; break;
                case "02": monthName = "Feb"; break;
                case "03": monthName = "Mar"; break;
                case "04": monthName = "Apr"; break;
                case "05": monthName = "May"; break;
                case "06": monthName = "Jun"; break;            
                case "07": monthName = "Jul"; break;
                case "08": monthName = "Aug"; break;
                case "09": monthName = "Sep"; break;
                case "10": monthName = "Oct"; break;    
                case "11": monthName = "Nov"; break;
                case "12": monthName = "Dec"; break;
                default: monthName = "Invalid month"; break;
            }
            if (!monthName.equals("Invalid month")) {
                System.out.println("The date in dd-MMM-yyyy format is: " + day + "-" + monthName + "-" + year);
            } else {
                System.out.println("Invalid month entered.");
            }
        } else {
            System.out.println("Invalid date format. Please enter in dd/MM/yyyy format.");
        }
        sc.close();
    }           
}