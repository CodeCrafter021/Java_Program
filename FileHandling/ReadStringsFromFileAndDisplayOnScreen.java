import java.io.*;

// Program to read strings from a file and display on screen
// Run ReceiveStringsFromKeyboardAndWriteToFile.java first to create the file
public class ReadStringsFromFileAndDisplayOnScreen {
    public static void main(String[] args) throws IOException {
        
        File file = new File("user_input.txt");
        if (!file.exists()) {
            System.out.println("File not found! Please run ReceiveStringsFromKeyboardAndWriteToFile.java first.");
            return;
        }
        
        BufferedReader br = new BufferedReader(new FileReader("user_input.txt"));
        String line;
        
        System.out.println("Reading from file:");
        // Read line by line until end of file
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        
        br.close();
    }
}
