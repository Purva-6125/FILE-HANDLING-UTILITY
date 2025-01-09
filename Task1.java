/**
 * Task1.java
 * 
 * A Java program demonstrating basic file operations: reading, writing,
 * and modifying text files. The program uses a menu-driven approach
 * to allow users to interact with a specified file.
 */

import java.io.*;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "example.txt"; // Path to the file to operate on

        while (true) {
            System.out.println("\nFile Operations Menu:");
            System.out.println("1. Write to File");
            System.out.println("2. Read from File");
            System.out.println("3. Modify Entire File");
            System.out.println("4. Modify Specific Content");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    writeToFile(filePath, scanner);
                    break;
                case 2:
                    readFromFile(filePath);
                    break;
                case 3:
                    modifyFile(filePath, scanner);
                    break;
                case 4:
                    modifySpecificContent(filePath, scanner);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Writes user-provided content to the specified file.
     * Appends the content to the existing file.
     *
     * @param filePath the path of the file
     * @param scanner  the Scanner object for user input
     */
    private static void writeToFile(String filePath, Scanner scanner) {
        System.out.print("Enter text to write to the file: ");
        String content = scanner.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
            writer.newLine();
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

    /**
     * Reads and displays the content of the specified file.
     *
     * @param filePath the path of the file
     */
    private static void readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("\nFile Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    /**
     * Replaces the content of the specified file with user-provided content.
     *
     * @param filePath the path of the file
     * @param scanner  the Scanner object for user input
     */
    private static void modifyFile(String filePath, Scanner scanner) {
        System.out.print("Enter text to replace existing content: ");
        String newContent = scanner.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, false))) {
            writer.write(newContent);
            writer.newLine();
            System.out.println("File content replaced successfully.");
        } catch (IOException e) {
            System.err.println("Error modifying the file: " + e.getMessage());
        }
    }

    /**
     * Modifies specific content in the file by replacing a target string with a new string.
     *
     * @param filePath the path of the file
     * @param scanner  the Scanner object for user input
     */
    private static void modifySpecificContent(String filePath, Scanner scanner) {
        System.out.print("Enter the text to be replaced: ");
        String target = scanner.nextLine();
        System.out.print("Enter the new text: ");
        String replacement = scanner.nextLine();

        try {
            File file = new File(filePath);
            if (!file.exists()) {
                System.err.println("File not found: " + filePath);
                return;
            }

            StringBuilder fileContent = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    fileContent.append(line.replace(target, replacement)).append(System.lineSeparator());
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(fileContent.toString());
            }

            System.out.println("Specific content modified successfully.");
        } catch (IOException e) {
            System.err.println("Error modifying specific content: " + e.getMessage());
        }
    }
}
