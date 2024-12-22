package First;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstProject {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = applicationContext.getBean("car", Car.class);

        System.out.println(car);

    }
}
