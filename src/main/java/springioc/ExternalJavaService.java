package springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ExternalJavaService {

    @Qualifier("mysqlConnectionService")
    @Autowired
    ConnectionService ConnectionService;
    public void external(){
        System.out.println("external");
        ConnectionService.getConnection("abc","abc","abc");
    }
}
