package locker;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@ComponentScan
@EnableAspectJAutoProxy
@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public Sahitya locker(){
        return new Sahitya();
    }
    @Bean
    public Pravallika locker1(){
       return new Pravallika();
    }

}
