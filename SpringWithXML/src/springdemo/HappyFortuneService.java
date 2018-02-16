package springdemo;

/**
 * Created by drake on 14/02/18.
 *
 * @author P.Pridorozhny
 */
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "lucky";
    }
}
