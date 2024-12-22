package Third;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Engine {
    private Starter starter;
    private SparkPlug sparkPlug;

    @Autowired
    public Engine(Starter starter, SparkPlug sparkPlug) {
        this.starter = starter;
        this.sparkPlug = sparkPlug;
    }

    @Override
    public String toString() {
        return "Engine with " + starter + " and " + sparkPlug;
    }
}
