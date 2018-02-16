package springdemo;

/**
 * Created by drake on 14/02/18.
 *
 * @author P.Pridorozhny
 */
public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;

    @Override
    public String getDailyWorkout() {
        return "crick";
    }

    @Override
    public String dailyFortune() {
        return "in fortune " + fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "CricketCoach{" +
                "fortuneService=" + fortuneService +
                ", email='" + email + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
