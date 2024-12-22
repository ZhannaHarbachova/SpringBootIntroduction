package Second;

import org.springframework.stereotype.Component;

@Component("secondAccumulator")
public class Accumulator {
    @Override
    public String toString() {
        return "Accumulator";
    }
}
