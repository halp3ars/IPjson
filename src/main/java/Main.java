import dto.IpDto;
import parser.JsonFileParser;
import parser.JsonUrlParser;
import parser.ParseStrategy;
import writer.WriteFile;

import java.io.IOException;
import java.net.URL;

public class Main {

    private static final String TARGET_FILE = "/Users/halpears/Desktop/ip-info.txt";
    public static IpDto ipDto = new IpDto();
    public static ParseStrategy strategy;

    public enum arguments {
        FILE("file"), URL("url");
        private String argument = null;
        arguments(String argument) {
            this.argument = argument;
        }
        public String getArgument() {
            return argument;
        }
    }
    public static void main(String[] args) throws IOException {
        if (args[0].equals(arguments.FILE.getArgument())) {
            strategy = new JsonFileParser();
        } else if (args[0].equals(arguments.URL.getArgument())) {
            strategy = new JsonUrlParser();
        } else {
            System.out.println("Strategy not correct, only 'file' or 'url'");
        }
        ipDto = strategy.parseFromLink();
        WriteFile.writeJsonObject(TARGET_FILE, ipDto.getIp());
    }
}