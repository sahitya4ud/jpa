package lockersystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan

public class LockerApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("lockersystem");


        //Retrieve beans
        Locker locker = context.getBean(Locker.class);
        locker.setStatus("Free");

        LockerService lockerService = context.getBean(LockerService.class);

        User user = context.getBean(User.class);
        user.setUserId(10);
        user.setName("sahitya");

        //Operations
          lockerService.assignLocker(user,1);
          lockerService.releaseLocker(1);


    }
}
