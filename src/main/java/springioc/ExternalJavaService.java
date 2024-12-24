package springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ExternalJavaService {

    @Qualifier("mysqlConnectionService")
    @Autowired
    ConnectionService ConnectionService;
    public void external(){

        long startTimrInmills = System.currentTimeMillis();

        System.out.println("Enter into external method");
        ConnectionService.getConnection("abc","abc","abc");

        long endTimeInmills = System.currentTimeMillis();
        System.out.println("Exit from external method timeTaken"+(endTimeInmills-startTimrInmills));
    }
}
