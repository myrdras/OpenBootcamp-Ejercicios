import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class OptionsParser {
    private ArrayList<HashMap<String, String>> lista = new ArrayList<>();
    private final HashMap<String, String> options = new HashMap<>();
    private String[] args;
    private String firstOption;

    private OptionsParser () {}
    public OptionsParser(String[] args) {
        this.args = args;
    }

    public void registerOption(String optionName) {
        options.put(optionName, "");
        if (Objects.equals(firstOption, optionName)) {
            parse();
            lista.add(options);
        }
        if (firstOption == null) {
            firstOption = optionName;
        }
    }
    
    public void setOptionValue(String optionName,String optionValue) {
        options.replace(optionName, optionValue);
    }

    public ArrayList<HashMap<String, String>> getLista() {
        return lista;
    }

    public void parse() {
        for (int i = 0; i < args.length; i++) {
            String optionName = args[i].replace("-", "");

            if (options.containsKey(optionName)) {
                setOptionValue(args[i], args[i+1]);
            }
        }
    }
}
