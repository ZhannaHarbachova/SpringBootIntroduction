package Second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myCar")
public class Car {
    private Wheel wheel;
    private Engine engine;
    private Accumulator accumulator;
    private Suspension suspension;

    @Autowired()
    public Car(@Qualifier("secondWheel") Wheel wheel, @Qualifier("secondEngine") Engine engine,
               @Qualifier("secondAccumulator") Accumulator accumulator,
               @Qualifier("secondSuspension") Suspension suspension) {
        this.wheel = wheel;
        this.engine = engine;
        this.accumulator = accumulator;
        this.suspension = suspension;
    }

    @Override
    public String toString() {
        return "Method 2. Car with " + wheel + ", " + engine + ", " + accumulator + ", " + suspension;
    }

}
