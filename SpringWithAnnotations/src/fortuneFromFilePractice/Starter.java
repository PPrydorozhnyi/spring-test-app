package fortuneFromFilePractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.Coach;

/**
 * Created by drake on 18/02/18.
 *
 * @author P.Pridorozhny
 */
public class Starter {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("fortune-applicationContext.xml");

        Coach coach = context.getBean("baseballCoach", Coach.class);

        System.out.println(coach.getDailyFortune());

        context.close();
    }

}
