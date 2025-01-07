package atmwithspringioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ATMConfiguration {

    @Bean
    @Scope("prototype")
    public CashDispenser cashDispenser(){
        return new CashDispenser("Prototype Dispenser");
    }

    @Bean
    public ATM atm(){
        return new ATM(cashDispenser(), cashDispenser());
    }
}
