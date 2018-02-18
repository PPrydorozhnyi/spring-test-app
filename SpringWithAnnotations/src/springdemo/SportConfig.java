package springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * Created by drake on 18/02/18.
 *
 * @author P.Pridorozhny
 */
@Configuration
@ComponentScan("springdemo")
public class SportConfig {

    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    @Bean
    public Coach swimmingCoach() {
        return new SwimmingCoach(happyFortuneService());
    }

}
