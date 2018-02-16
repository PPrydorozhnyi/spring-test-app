package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by drake on 15/02/18.
 *
 * @author P.Pridorozhny
 */
public class LifeCycleDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("lifeCycle-applicationContext.xml");

        Coach coach = context.getBean("myCoach", TrackCoach.class);

        context.close();
    }
}
