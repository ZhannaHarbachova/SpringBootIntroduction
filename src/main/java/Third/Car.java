package Third;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Car {
    private Wheel wheel;
    private Engine engine;
    private Accumulator accumulator;
    private Suspension suspension;

    public Car(Wheel wheel, Engine engine, Accumulator accumulator, Suspension suspension) {
        this.wheel = wheel;
        this.engine = engine;
        this.accumulator = accumulator;
        this.suspension = suspension;
    }

    @Override
    public String toString() {
        return "Method 3. Car with " + wheel + ", " + engine + ", " + accumulator + ", " + suspension;
    }

}
