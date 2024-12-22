package Third;

import org.springframework.stereotype.Component;

@Component("thirdAccumulator")
public class Accumulator {
    @Override
    public String toString() {
        return "Accumulator";
    }
}
