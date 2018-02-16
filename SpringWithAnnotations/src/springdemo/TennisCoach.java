package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by drake on 16/02/18.
 *
 * @author P.Pridorozhny
 */
@Component()
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    public TennisCoach() {}

    @Override
    public String getDailyWorkout() {
        return "tennis trains";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
