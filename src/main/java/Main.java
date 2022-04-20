import dto.IpDto;
import parser.JsonFileParser;
import parser.JsonUrlParser;
import parser.ParseStrategy;
import writer.WriteFile;

import java.io.IOException;

public class Main {

    private static final String TARGET_FILE = "/Users/halpears/Desktop/ip-info.txt";
    public static IpDto ipDto = new IpDto();
    public static ParseStrategy strategy;
    public enum Arguments {
        FILE, URL
    }

    public static void main(String[] args) throws IOException {
        try {
            if (args[0].equals(Arguments.FILE.name())) {
                strategy = new JsonFileParser();
            } else if (args[0].equals(Arguments.URL.name())) {
                strategy = new JsonUrlParser();
            } else {
                System.out.println("Argument not correct, only 'FILE' or 'URL'");
            }
            ipDto = strategy.parseFromLink();
            WriteFile.writeJsonObject(TARGET_FILE, ipDto.getIp());
        } catch (NullPointerException | ArrayIndexOutOfBoundsException exception) {
            System.out.println("Error " + exception.getMessage());
            exception.printStackTrace();
        }
    }
}