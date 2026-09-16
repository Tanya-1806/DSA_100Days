// Q10 (User Inputs, Operations & Output)
// Write a program to input time in seconds and convert it to hours:minutes:seconds format.

import java.util.Scanner;   

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in seconds");
        int totalSeconds = sc.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println("Time in hours:minutes:seconds format is: " + hours + ":" + minutes + ":" + seconds);
    }
}