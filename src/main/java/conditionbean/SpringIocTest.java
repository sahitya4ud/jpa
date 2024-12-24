package conditionbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springioc.EmployeeService;

public class SpringIocTest {
    public static void main(String[] args) {

        System.setProperty("webservicdetype","rest");
      ApplicationContext context =new AnnotationConfigApplicationContext(ConditionalBeanConfigurationDemo.class);

        WebServiceClientService webServiceClientService = context.getBean("webServiceClientService", WebServiceClientService.class);
        webServiceClientService.callRemoteMethod();

    }
}
