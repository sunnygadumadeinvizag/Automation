package onboarding.task.four;

import java.util.HashMap;
import java.util.Map;

public interface Appliances {
    static final Map<String, Integer> applianceType = new HashMap<String, Integer>() {{


        put("Fan", 1);

        put("Light", 2);

        put("TV", 3);
        put("Laptop", 4);
    }};
}
