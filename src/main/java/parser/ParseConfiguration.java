package parser;

import dto.IpDto;
import writer.WriteFile;

import java.io.IOException;
import java.util.Scanner;

public class ParseConfiguration {

    private final JsonFileParser JSON_FILE_PARSER = new JsonFileParser();
    private final JsonUrlParser JSON_URL_PARSER = new JsonUrlParser();
    private final String TARGET_FILE = "/Users/halpears/Desktop/ip-info.txt";

    public void parseWay() throws IOException {

        System.out.println("1 - URL , 2 - File");
        Scanner scanner = new Scanner(System.in);
        int way = scanner.nextInt();

        switch (way) {
            case 1: IpDto ipDto = JSON_URL_PARSER.parseFromLink();
                WriteFile.writeJsonObject(TARGET_FILE, ipDto.getIp());
                break;
            case 2:
                ipDto = JSON_FILE_PARSER.parseFromLink();
                WriteFile.writeJsonObject(TARGET_FILE, ipDto.getIp());
                break;
            default:
                System.out.println("Not correct way");
        }


    }

}
