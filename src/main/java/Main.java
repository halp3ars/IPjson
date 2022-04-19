import parser.ParseConfiguration;

import java.io.IOException;

public class Main {

    private static final String TARGET_FILE = "/Users/halpears/Desktop/ip-info.txt";
    private static final ParseConfiguration PARSE_CONFIGURATION = new ParseConfiguration();

    public static void main(String[] args) throws IOException {
        PARSE_CONFIGURATION.parseWay(TARGET_FILE);
    }
}
