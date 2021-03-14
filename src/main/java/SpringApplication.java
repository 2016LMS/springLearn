import org.mslin.springLearning.model.Car;
import org.mslin.springLearning.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.FileReader;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = applicationContext.getBean(User.class);
        Car car = applicationContext.getBean(Car.class);
        System.out.println(car.getName());
        System.out.println(car.getUser().getId());
        System.out.println(car.getClass());
        int count = applicationContext.getBeanDefinitionCount();
        System.out.println(count);
        System.out.println(user.getId());
    }
}
