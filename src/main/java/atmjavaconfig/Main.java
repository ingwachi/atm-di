package atmjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ATMConfig.class);

        ATMSimulator atmSimulator = context.getBean(ATMSimulator.class);
        atmSimulator.run();
    }
}
