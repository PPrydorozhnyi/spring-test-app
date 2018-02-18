package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by drake on 18/02/18.
 *
 * @author P.Pridorozhny
 */
public class AnnotationBeanScopeApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach coach1 = context.getBean("tennisCoach", Coach.class);

        System.out.println(coach.equals(coach1));

        context.close();
    }
}
