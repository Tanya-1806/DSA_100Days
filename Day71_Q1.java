// Q121 (File Handling)
// Write a C program that creates a text file named info.txt in write mode. 
// The program should take the user’s name and age as input, and write them to the file using fprintf(). After writing, display a message confirming that the data was successfully saved.


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            FileWriter writer = new FileWriter("info.txt");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.close();
            System.out.println("Data successfully saved to info.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}