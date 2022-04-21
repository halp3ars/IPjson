import parser.JsonFileParser;
import parser.JsonUrlParser;
import parser.ParseStrategy;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TypeStrategy {
    private final Map<String, ParseStrategy> STRATEGY_MAP = new HashMap<>();

    public TypeStrategy() throws NullPointerException{
        try {
            STRATEGY_MAP.put("file", new JsonFileParser());
            STRATEGY_MAP.put("url", new JsonUrlParser());
        }catch (NullPointerException exception){
            System.out.println("Correct arguments are : " + STRATEGY_MAP.keySet());
        }
    }

    public Set<String> getStrategyKeySet() {
        return STRATEGY_MAP.keySet();
    }

    public ParseStrategy getStrategy(String strategy) {
        return STRATEGY_MAP.get(strategy);
    }

}
