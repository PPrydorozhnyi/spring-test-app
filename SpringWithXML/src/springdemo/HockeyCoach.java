package springdemo;

/**
 * Created by drake on 14/02/18.
 *
 * @author P.Pridorozhny
 */
public class HockeyCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "hockey";
    }

    @Override
    public String dailyFortune() {
        return null;
    }
}
