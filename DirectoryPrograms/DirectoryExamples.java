package Java.DirectoryPrograms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class DirectoryExamples {
    public static void main(String[] args) throws IOException {
        Path directory = Path.of(".").toAbsolutePath().normalize();
        System.out.println("Working directory: " + directory);
        try (Stream<Path> paths = Files.list(directory)) {
            paths.forEach(path -> System.out.println((Files.isDirectory(path) ? "Directory: " : "File: ") + path.getFileName()));
        }
        try (Stream<Path> paths = Files.walk(directory)) {
            long size = paths.filter(Files::isRegularFile).mapToLong(path -> {
                try { return Files.size(path); } catch (IOException exception) { return 0; }
            }).sum();
            System.out.println("Directory size: " + size + " bytes");
        }
        System.out.println("Java files: " + Files.find(directory, 3, (path, attributes) -> path.toString().endsWith(".java")).count());
    }
}