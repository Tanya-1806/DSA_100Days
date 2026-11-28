// Q122 (File Handling)
// Write a C program that opens an existing file (e.g., info.txt) and reads its contents using fgets(). 
// The program should print all the lines to the console until EOF (end of file) is reached.


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException; 

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("info.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}