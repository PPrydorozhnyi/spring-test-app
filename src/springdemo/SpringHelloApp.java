package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by drake on 14/02/18.
 *
 * @author P.Pridorozhny
 */
public class SpringHelloApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("cricketCoatch", Coach.class);

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.dailyFortune());

        context.close();
    }
}
