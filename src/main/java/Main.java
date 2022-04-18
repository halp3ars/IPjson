import parser.JsonFileParser;
import dto.IpDto;
import parser.JsonUrlParser;
import writer.WriteFile;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final String URL = "https://api.ipify.org/?format=json";
        final String PATH_TO_FILE = "/Users/halpears/Desktop/test.txt";
        final String PATH = "/Users/halpears/Desktop/ip-info.txt";


        JsonFileParser jsonFileParser = new JsonFileParser();
        JsonUrlParser jsonUrlParser = new JsonUrlParser();

        //IpDto ip = jsonUrlParser.parseFromLink(URL);
        IpDto ip = jsonFileParser.parseFromLink(PATH_TO_FILE);
        WriteFile.writeJsonObject(PATH, ip.getIp());

    }
}
