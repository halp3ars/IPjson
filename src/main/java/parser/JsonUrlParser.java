package parser;

import dto.IpDto;
import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;


public class JsonUrlParser implements ParseStrategy {

    private final Gson GSON = new Gson();
    private final String URL = "https://api.ipify.org/?format=json";

    @Override
    public IpDto parseFromLink() throws IOException {

        Document response = Jsoup.connect(URL).ignoreContentType(true).get();
        return GSON.fromJson(response.text(), IpDto.class);


    }
}
