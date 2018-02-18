package fortuneFromFilePractice;

import org.springframework.stereotype.Component;
import springdemo.FortuneService;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by drake on 18/02/18.
 *
 * @author P.Pridorozhny
 */
@Component
public class FortuneFromFile implements FortuneService {

    private Random random;
    private List<String> fortunes;
    private String fileName;

    public FortuneFromFile() {
        random = new Random();
        fortunes = new ArrayList<>();
        fileName = "/home/drake/JavaProjects/Spring-APP/SpringWithAnnotations/src/fortuneFromFilePractice/someFortunes.txt";
    }

    @PostConstruct
    private void loadFortunes() {

        try {
            fortunes = Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        return fortunes.get(random.nextInt(fortunes.size()));
    }
}
