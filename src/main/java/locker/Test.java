package locker;

import conditionbean.ConditionalBeanConfigurationDemo;
import conditionbean.WebServiceClientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext("locker");
        Sahitya s = context.getBean("s", Sahitya.class);

         s.returnLocker();
    }
}