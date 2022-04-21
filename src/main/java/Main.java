import dto.IpDto;
import writer.WriteFile;
import java.io.IOException;

public class Main {

    private static final String TARGET_FILE = "/Users/halpears/Desktop/ip-info.txt";
    private static IpDto ipDto = new IpDto();
    private final static TypeConnection TYPE_CONNECTION = new TypeConnection();

    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            ipDto = TYPE_CONNECTION.getStrategy(args[0]).parseFromLink();
            WriteFile.writeJsonObject(TARGET_FILE, ipDto.getIp());
        } else {
            System.out.println("Arguments not found");
        }
    }


}