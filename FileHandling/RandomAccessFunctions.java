import java.io.*;

// Program demonstrating random access file operations (like C's fseek, ftell, rewind)
// RandomAccessFile in Java allows jumping to any position in a file
public class RandomAccessFunctions {
    public static void main(String[] args) throws IOException {
        
        // Create and write to a file
        RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");
        raf.writeBytes("Hello Programming World");
        
        // Show current position (like C's ftell)
        long position = raf.getFilePointer();
        System.out.println("Current position after writing: " + position);
        
        // Go back to start (like C's rewind)
        raf.seek(0);
        System.out.println("Position after rewind: " + raf.getFilePointer());
        
        // Jump to position 6 (like C's fseek with SEEK_SET)
        raf.seek(6);
        char ch = (char) raf.readByte();
        System.out.println("Character at position 6: " + ch);
        
        raf.close();
    }
}
