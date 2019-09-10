package atmwithdatabase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ATMWithDBJavaConfig {

    @Bean
    public ReadDataFromText readDataFromText() { return new ReadDataFromText("customers.txt"); }

    @Bean
    public ReadDataFromDB readDataFromDB() { return new ReadDataFromDB(); }
    @Bean
    public Bank bank(){
        return new Bank(readDataFromDB());
    }

    @Bean
    public ATM atm(){
        return new ATM(bank());
    }

    @Bean
    public ATMSimulator atmSimulator() {
        return new ATMSimulator(atm());
    }
}
