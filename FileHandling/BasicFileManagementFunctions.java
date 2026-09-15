import java.io.*;

// Program demonstrating basic file operations in Java
// Equivalent to C's putc/getc, fprintf/fscanf, putw/getw
public class BasicFileManagementFunctions {
    public static void main(String[] args) throws IOException {
        
        // --- Write and Read a single character (like C's putc/getc) ---
        FileWriter fw1 = new FileWriter("file1.txt");
        fw1.write('A'); // Write character
        fw1.close();
        
        FileReader fr1 = new FileReader("file1.txt");
        int ch = fr1.read(); // Read character
        System.out.println("Read this character: " + (char) ch);
        fr1.close();
        
        // --- Write and Read a string and number (like C's fprintf/fscanf) ---
        PrintWriter pw = new PrintWriter(new FileWriter("file2.txt"));
        pw.print("Apple 100"); // Write text
        pw.close();
        
        BufferedReader br = new BufferedReader(new FileReader("file2.txt"));
        String line = br.readLine();
        System.out.println("Read this word and number: " + line);
        br.close();
        
        // --- Write and Read an integer (like C's putw/getw) ---
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("file3.txt"));
        dos.writeInt(500); // Write integer as bytes
        dos.close();
        
        DataInputStream dis = new DataInputStream(new FileInputStream("file3.txt"));
        int num = dis.readInt(); // Read integer
        System.out.println("Read this number: " + num);
        dis.close();
        
        System.out.println("\nAll file operations completed successfully!");
    }
}
