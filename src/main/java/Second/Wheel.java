package Second;

import org.springframework.stereotype.Component;

@Component("secondWheel")
public class Wheel {
    @Override
    public String toString() {
        return "Wheel";
    }
}
