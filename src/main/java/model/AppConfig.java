package model;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean (name = "car")
    public Car getCarBean() {
        return new Car("LADA");
    }
    @Bean (name = "bus")
    public Bus getBusBean() {
        return new Bus("PAZ");
    }
    @Bean (name = "pickup")
    public Pickup getPickupBean() {
        return new Pickup("FORD");
    }
    @Bean(name = "driver")
    public Driver getDriver() {
        return new Driver("Лёха", getCarBean());
    }
    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver("Sanek", getBusBean());
    }
    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver("Penek", getPickupBean());
    }
}
