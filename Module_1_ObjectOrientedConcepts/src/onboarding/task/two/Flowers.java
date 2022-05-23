package onboarding.task.two;

import java.util.HashMap;
import java.util.Map;

public interface Flowers {
    static final Map<String, Integer> flowerType = new HashMap<String, Integer>() {{


        put("Rose", 1);

        put("Jasmine", 2);

        put("Lyly", 3);
    }};
}
