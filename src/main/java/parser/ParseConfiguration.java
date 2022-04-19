package parser;

import dto.IpDto;
import writer.WriteFile;

import java.io.IOException;
import java.util.Scanner;

public class ParseConfiguration {

    private final JsonFileParser JSON_FILE_PARSER = new JsonFileParser();
    private final JsonUrlParser JSON_URL_PARSER = new JsonUrlParser();


    public void parseWay(String target) throws IOException {

        System.out.println("1 - URL 2 - File");
        Scanner scanner = new Scanner(System.in);

        int Way = scanner.nextInt();

        if (Way == 1) {
            IpDto ipDto = JSON_URL_PARSER.parseFromLink();
            WriteFile.writeJsonObject(target, ipDto.getIp());
        }
        if (Way == 2) {

            IpDto ipDto = JSON_FILE_PARSER.parseFromLink();
            WriteFile.writeJsonObject(target, ipDto.getIp());
        }


    }

}
