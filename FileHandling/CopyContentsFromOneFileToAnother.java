import java.io.*;

// Program to copy all contents from one file to another
public class CopyContentsFromOneFileToAnother {
    public static void main(String[] args) throws IOException {
        
        // First create source file with some data
        PrintWriter pw = new PrintWriter(new FileWriter("source.txt"));
        pw.print("Copy this data to the new file.");
        pw.close();
        
        // Open source file for reading and target file for writing
        FileReader fr = new FileReader("source.txt");
        FileWriter fw = new FileWriter("target.txt");
        
        int ch;
        // Read one character at a time and write to target file
        while ((ch = fr.read()) != -1) { // -1 means end of file (like EOF in C)
            fw.write(ch);
        }
        
        System.out.println("File copied successfully!");
        
        fr.close();
        fw.close();
    }
}
