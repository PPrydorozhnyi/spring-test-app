package springdemo;

/**
 * Created by drake on 14/02/18.
 *
 * @author P.Pridorozhny
 */
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run";
    }

    @Override
    public String dailyFortune() {
        return "in TrackCoach " + fortuneService.getFortune() ;
    }

    //int method for Spring
    public void doMyStartupStuff() {
        System.out.println("init method in TrackCoach");
    }

    //destroy method in Spring
    public void doMyCleanupStuf() {
        System.out.println("destroy method in TrackCoach");
    }
}
