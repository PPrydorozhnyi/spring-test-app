package fortuneFromFilePractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springdemo.Coach;
import springdemo.FortuneService;

/**
 * Created by drake on 18/02/18.
 *
 * @author P.Pridorozhny
 */
@Component
public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public BaseballCoach(@Qualifier("fortuneFromFile") FortuneService fortune) {
        fortuneService = fortune;
    }

    @Override
    public String getDailyWorkout() {
        return "baseball";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
