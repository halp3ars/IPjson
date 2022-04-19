import dto.IpDto;
import parser.JsonFileParser;
import parser.JsonUrlParser;
import parser.ParseStrategy;
import writer.WriteFile;

import java.io.IOException;

public class Main {

    private static final String TARGET_FILE = "/Users/halpears/Desktop/ip-info.txt";

    public static void main(String[] args) throws IOException {
        if (args[0].equals("url")) {
            ParseStrategy strategy = new JsonUrlParser();
            IpDto ipDto = strategy.parseFromLink();
            WriteFile.writeJsonObject(TARGET_FILE, ipDto.getIp());
        } else if (args[0].equals("file")) {
            ParseStrategy strategy = new JsonFileParser();
            IpDto ipDto = strategy.parseFromLink();
            WriteFile.writeJsonObject(TARGET_FILE, ipDto.getIp());
        } else {
            System.out.println("Strategy not chosen");
        }
    }
}
