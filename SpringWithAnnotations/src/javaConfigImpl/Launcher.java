package javaConfigImpl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springdemo.Coach;

/**
 * Created by drake on 18/02/18.
 *
 * @author P.Pridorozhny
 */
public class Launcher {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CoachConfig.class);

        System.out.println(context.getBean("sCoach", Coach.class));

        context.close();
    }
}
