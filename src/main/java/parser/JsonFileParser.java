package parser;

import com.google.gson.Gson;
import dto.IpDto;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonFileParser implements ParseStrategy {

    private Gson gson = new Gson();

    @Override
    public IpDto parseFromLink(String link) throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get(link));
        return gson.fromJson(reader, IpDto.class);
    }
}
