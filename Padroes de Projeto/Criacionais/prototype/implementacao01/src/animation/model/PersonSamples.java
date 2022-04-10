package animation.model;

import java.util.HashMap;
import java.util.Map;

public class PersonSamples {

    private Map<String, Person> samples;

    public PersonSamples() {
        samples = new HashMap<>();
        loadSamples();
    }

    public Person get(String type) {
        return samples.get(type);
    }

    private void loadSamples() {
        samples.put("gostosa", new Person(
                "               (O O)               ",
                "           l ( . )( . )l            ",
                "                )   (               ",
                "______________(   y   )_____________"));

        samples.put("gostosa2", new Person(
                "               (^ ^)               ",
                "           ~~( . )( . )~~           ",
                "                )   (               ",
                "______________(   y   )______________"));



    }
}
