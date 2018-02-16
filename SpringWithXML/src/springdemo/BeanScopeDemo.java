package springdemo;

import org.springframework.batch.core.configuration.support.ClasspathXmlApplicationContextsFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by drake on 15/02/18.
 *
 * @author P.Pridorozhny
 */
public class BeanScopeDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");


        Coach coach = context.getBean("myCoach", Coach.class);

        Coach coach1 = context.getBean("myCoach", Coach.class);

        System.out.println(coach.equals(coach1));

        context.close();
    }
}
