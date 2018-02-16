package springdemo;

import org.springframework.stereotype.Component;

/**
 * Created by drake on 16/02/18.
 *
 * @author P.Pridorozhny
 */
@Component
public class RESTFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "REST fortune";
    }
}
