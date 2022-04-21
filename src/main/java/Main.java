import dto.IpDto;
import writer.WriteFile;

import java.io.IOException;

public class Main {

    private static final String TARGET_FILE = "/Users/halpears/Desktop/ip-info.txt";
    private static IpDto ipDto = new IpDto();
    private final static TypeStrategy TYPE_STRATEGY = new TypeStrategy();

    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            ipDto = TYPE_STRATEGY.getStrategy(args[0]).parseFromLink();
            WriteFile.writeJsonObject(TARGET_FILE, ipDto.getIp());
        } else {
            System.out.println("Arguments not found");
        }
    }


}