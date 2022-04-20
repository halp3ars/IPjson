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

    public static void main(String[] args) throws IOException {
            if (args[0].equals("url")) {
                strategy = new JsonUrlParser();
                ipDto = strategy.parseFromLink();
            } else if (args[0].equals("file")) {
                strategy = new JsonFileParser();
                ipDto = strategy.parseFromLink();
            } else {
                System.out.println("Strategy not chosen, only 'file' or 'url'");
            }
            WriteFile.writeJsonObject(TARGET_FILE, ipDto.getIp());
    }
}
