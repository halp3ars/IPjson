package parser;

import dto.IpDto;

import java.io.IOException;

public interface ParseStrategy {
    IpDto parseFromLink() throws IOException;
}
