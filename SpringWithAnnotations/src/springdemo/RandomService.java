package springdemo;

import org.springframework.stereotype.Component;

/**
 * Created by drake on 16/02/18.
 *
 * @author P.Pridorozhny
 */
@Component
public class RandomService implements FortuneService {
    @Override
    public String getFortune() {
        return "random fortune";
    }
}
