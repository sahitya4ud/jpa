package conditionbean;

import org.springframework.context.annotation.*;


@ComponentScan(basePackages = {"conditionbean"})
@Configuration

public class ConditionalBeanConfigurationDemo {
@Conditional({MyRestSimpleCondition.class})
@Bean

    public IntegrationWebService integrationWebService(){
    return new RestWebServiceImpl();
}


    public IntegrationWebService soapIntegrationWebService(){
        return new SoapWebServiceImpl();
    }
}
