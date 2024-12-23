package Second;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SecondProject {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = applicationContext.getBean("myCar", Second.Car.class);

        System.out.println(car);

    }
}
