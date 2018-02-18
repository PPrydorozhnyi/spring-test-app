package springdemo;

import org.springframework.context.annotation.*;

/**
 * Created by drake on 18/02/18.
 *
 * @author P.Pridorozhny
 */
@Configuration
@ComponentScan("springdemo")
@PropertySource("classpath:sport.properties")
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
