package springdemo;

import java.util.Random;

/**
 * Created by drake on 14/02/18.
 *
 * @author P.Pridorozhny
 */
public class CustomFortuneService implements FortuneService {

    private String[] fortunes;
    private Random random;

    public CustomFortuneService() {
        fortunes = new String[]{"lucky", "partly lucky", "no luck for you, dude"};
        random = new Random();
    }

    @Override
    public String getFortune() {

        return fortunes[random.nextInt(3)];
    }
}
