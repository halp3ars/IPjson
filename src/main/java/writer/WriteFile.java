package writer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFile {

    public static void writeJsonObject(String path, String text) {
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(path), Charset.defaultCharset())) {
            writer.write(text);
            System.out.println("File wrote");
        } catch (IOException | NullPointerException ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }
}
