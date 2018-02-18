package javaConfigImpl;

import springdemo.FortuneService;

/**
 * Created by drake on 18/02/18.
 *
 * @author P.Pridorozhny
 */
public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "sad";
    }
}
