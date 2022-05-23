package onboarding.task.one;

import java.util.HashMap;
import java.util.Map;

public interface PizzaBase {
    static final Map<String, Integer> pizzaBaseType = new HashMap<String, Integer>() {{


        put("Standard", 60);

        put("Soft", 90);
    }};
}
