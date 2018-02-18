package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by drake on 18/02/18.
 *
 * @author P.Pridorozhny
 */

public class SwimmingCoach implements Coach {

    private FortuneService fortuneService;

    public SwimmingCoach(FortuneService fortune) {
        fortuneService = fortune;
    }

    @Override
    public String getDailyWorkout() {
        return "swimming";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
