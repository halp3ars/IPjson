import parser.JsonFileParser;
import parser.JsonUrlParser;
import parser.ParseStrategy;

import java.util.HashMap;
import java.util.Map;

public class TypeStrategy {
    private final Map<String, ParseStrategy> STRATEGY_MAP = new HashMap<>();

    public TypeStrategy() {
        STRATEGY_MAP.put("file", new JsonFileParser());
        STRATEGY_MAP.put("url", new JsonUrlParser());
    }

    public ParseStrategy getStrategy(String strategy) {
        return STRATEGY_MAP.get(strategy);
    }
}
