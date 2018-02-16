package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by drake on 16/02/18.
 *
 * @author P.Pridorozhny
 */
@Component()
public class TennisCoach implements Coach {

//    @Autowired
//    @Qualifier("randomService")
    private FortuneService fortuneService;
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    @Autowired
    public TennisCoach(@Qualifier("randomService") FortuneService theFortuneService) {

        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");

        fortuneService = theFortuneService;
    }

    // define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
    }

    public TennisCoach() {}

    @Override
    public String getDailyWorkout() {
        return "tennis trains";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


    @Override
    public String toString() {
        return "TennisCoach{" +
                "email='" + email + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
