package parser;

import com.google.gson.Gson;
import dto.IpDto;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonFileParser implements ParseStrategy {

    private final Gson GSON = new Gson();
    private final String SOURCE_FILE = "/Users/halpears/Desktop/test.txt";

    @Override
    public IpDto parseFromLink() throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get(SOURCE_FILE));
        return GSON.fromJson(reader, IpDto.class);
    }
}
