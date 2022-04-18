package parser;

import dto.IpDto;

import java.io.IOException;

public interface ParseStrategy {

    public IpDto parseFromLink(String link) throws IOException;
}
