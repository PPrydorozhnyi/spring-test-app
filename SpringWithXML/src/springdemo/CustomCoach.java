package springdemo;

/**
 * Created by drake on 14/02/18.
 *
 * @author P.Pridorozhny
 */
public class CustomCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;

    public CustomCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "in Custom";
    }

    @Override
    public String dailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String toString() {
        return "CustomCoach{" +
                "fortuneService=" + fortuneService +
                ", email='" + email + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
