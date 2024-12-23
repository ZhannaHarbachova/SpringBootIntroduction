package Third;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ThirdProject {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ConfigurationClass.class);

        Car car = applicationContext.getBean(Car.class);

        System.out.println(car);

    }
}
