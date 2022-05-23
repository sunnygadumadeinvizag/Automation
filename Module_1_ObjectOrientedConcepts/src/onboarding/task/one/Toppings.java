package onboarding.task.one;

import java.util.HashMap;
import java.util.Map;

public interface Toppings {
    static final Map<String, Integer> toppingType = new HashMap<String, Integer>() {{


        put("Tomato", 1);

        put("Corn", 2);

        put("Mushrooms", 3);
    }};
}
