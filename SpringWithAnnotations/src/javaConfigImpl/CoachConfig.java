package javaConfigImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import springdemo.Coach;
import springdemo.FortuneService;

/**
 * Created by drake on 18/02/18.
 *
 * @author P.Pridorozhny
 */
@Configuration
@ComponentScan("javaConfigImpl")
@PropertySource("classpath:sport.properties")
public class CoachConfig {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach sCoach() {
        return new SCoach(sadFortuneService());
    }

}
