package springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired

    PayService payService;

    public EmployeeService(){
        System.out.println("from constructor ====");
    }
    public void project(){
        System.out.println("Enter into project method");

        payService.pay();
        System.out.println("Exit into project method");
    }

}
