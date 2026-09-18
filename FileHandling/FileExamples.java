import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class FileExamples {
    public static void main(String[] args) throws IOException {
        Path file = Files.createTempFile("java-example-", ".txt");
        Files.writeString(file, "Java file example\nJava is portable\n");
        Files.writeString(file, "Appended line\n", java.nio.file.StandardOpenOption.APPEND);
        System.out.println("Created: " + file);
        System.out.println("Matches: " + Pattern.compile("Java.*").matcher(Files.readString(file)).results().count());
        Path copy = file.resolveSibling(file.getFileName() + ".copy");
        Files.copy(file, copy, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Same path: " + Files.isSameFile(file, copy));
        Files.move(copy, copy.resolveSibling("renamed.txt"), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        Files.deleteIfExists(file);
        Files.deleteIfExists(copy.resolveSibling("renamed.txt"));
        System.out.println("Temporary file cleaned up");
        System.out.println("ZIP entries can be read with ZipFile and ZipEntry APIs: " + ZipEntry.class.getSimpleName());
        System.out.println("ZIP implementation: " + ZipFile.class.getSimpleName());
    }
}