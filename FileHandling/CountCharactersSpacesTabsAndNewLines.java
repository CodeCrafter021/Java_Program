import java.io.*;

// Program to count total characters, spaces, tabs, and newlines in a file
public class CountCharactersSpacesTabsAndNewLines {
    public static void main(String[] args) throws IOException {
        
        // Create a file with sample content
        PrintWriter pw = new PrintWriter(new FileWriter("count.txt"));
        pw.print("Hello World \n \t Welcome to Java");
        pw.close();
        
        // Now read and count
        FileReader fr = new FileReader("count.txt");
        int chars = 0, spaces = 0, tabs = 0, newlines = 0;
        int ch;
        
        while ((ch = fr.read()) != -1) {
            chars++;              // Count every character
            if (ch == ' ')  spaces++;   // Count spaces
            if (ch == '\t') tabs++;     // Count tabs
            if (ch == '\n') newlines++; // Count new lines
        }
        fr.close();
        
        System.out.println("Total Characters: " + chars);
        System.out.println("Total Spaces: " + spaces);
        System.out.println("Total Tabs: " + tabs);
        System.out.println("Total New Lines: " + newlines);
    }
}
