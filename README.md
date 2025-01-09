# FILE-HANDLING-UTILITY

**COMPANY** : CODTECH IT SOLUTION

**NAME** : PURVA KISHOR BAKARE

**INTERN ID** : CT08GOM

**DOMAIN** : JAVA PROGRAMMING

**BATCH DURATION** : JANUARY 5th, 2025 to FEBRUVARY 5th, 2025

**MENTOR NAME** : NEELA SANTOSH

**DESCRIPTION OF TASK** : This Java program, titled Task1.java, is designed to demonstrate basic file handling capabilities. It uses a menu-driven approach to allow users to perform common file operations such as writing to a file, reading from it, replacing its entire content, or modifying specific portions of its content. 

Tools and Resources Used :
Java Development Kit (JDK):
The program is written in Java, so the JDK is essential for compiling and running the code. This includes tools like the javac compiler and the Java Virtual Machine (JVM).

Text Editor:
The program is written and executed in any text notepad.

File System:
The file handling operations directly interact with the file system, using a local file named example.txt.

Libraries Used :
java.io.*:
FileReader, FileWriter: Handle reading from and writing to files.
BufferedReader, BufferedWriter: Provide efficient methods to read/write content line by line.
File: Represents file and directory pathnames in an abstract manner.

java.util.Scanner:
Used for reading user input. It helps in capturing choices and text inputs to perform desired operations interactively.

Program Breakdown and Functionality :
1. Menu-Driven Interface :
The program starts by displaying a menu with five options:
Write to File
Read from File
Modify Entire File
Modify Specific Content
Exit
The user selects an option by entering the corresponding number. The program then calls the relevant function.

2. Write to File
Appends user-provided content to the specified file (example.txt).
Implementation:
Uses a BufferedWriter with FileWriter in append mode (true).
Captures the content through Scanner and writes it line by line.

Output:
Successfully appends content, displaying "Content written to the file successfully."
If an error occurs, an exception is caught, and a message like "Error writing to the file" is displayed.

3. Read from File
Reads the content of the file and displays it on the console.
Implementation:
Utilizes a BufferedReader to read each line until the end of the file.
Handles FileNotFoundException if the file does not exist.

Output:
Prints each line from the file, or an error message if the file is not found.

5. Modify Entire File
Replaces the file’s entire content with new content provided by the user.
Implementation:
Opens the file in overwrite mode using FileWriter (false for append mode).

Output:
Successfully replaces the content, with a confirmation message: "File content replaced successfully."

7. Modify Specific Content
Finds and replaces specific words or phrases in the file.
Implementation:
Reads all content into a StringBuilder object.
Performs string replacement using String.replace(target, replacement).
Writes the modified content back to the file.

Output:
Displays "Specific content modified successfully" upon successful execution.

9. Exit
Terminates the program successfully.

How the Program Produces Output:
Write Operation:
The user inputs text. This is appended to the file without overwriting existing content.

Read Operation:
The console displays the entire content of example.txt. If the file is empty or missing, appropriate error messages are displayed.

Modify Entire File:
All existing content in the file is cleared, and the user-provided content replaces it.

Modify Specific Content:
Existing phrases or words in the file are replaced based on user inputs for the target and replacement strings.

**OUTPUT OF CODE** :
![Screenshot (620)](https://github.com/user-attachments/assets/639e60e4-c7f4-43db-ac94-b839155e017d)
![Screenshot (621)](https://github.com/user-attachments/assets/0d4c33e7-ffc5-4032-8ea8-9653143412f7)
