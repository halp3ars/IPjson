package parser;

import dto.IpDto;
import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;


public class JsonUrlParser implements ParseStrategy {

    private final Gson gson = new Gson();

    @Override
    public IpDto parseFromLink(String link) throws IOException {
        Document response = Jsoup.connect(link).ignoreContentType(true).get();
        return gson.fromJson(response.text(), IpDto.class);
    }
}
