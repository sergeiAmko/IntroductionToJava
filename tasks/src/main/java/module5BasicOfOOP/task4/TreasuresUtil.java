package module5BasicOfOOP.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TreasuresUtil {

    List<Treasure> treasures = new ArrayList<>();
    private Path pathSource = Paths.get("E:\\java\\projects\\IntroductionToJava\\tasks\\src\\main\\java",
            "module5BasicOfOOP\\task4\\sourceTreasures");

    public TreasuresUtil() {
        createTreasures();
    }

    private void createTreasures() {

        try (BufferedReader bufferedReader = Files.newBufferedReader(pathSource)) {

            String s;
            String[] sSplit;

            while ((s = bufferedReader.readLine()) != null) {

                sSplit = s.split(";");

                treasures.add(new Treasure(sSplit[0], Double.parseDouble(sSplit[1])));

            }


        } catch (IOException e) {
            System.out.println("ERROR opening of file");
        }

    }


    public void print() {
        print(treasures);
    }

    public Treasure max() {

        return Collections.max(treasures, Comparator.comparing(Treasure::getCost));

    }

    public Treasure min() {
        return Collections.min(treasures, Comparator.comparing(Treasure::getCost));
    }

    static public void print(List<Treasure> treasures) {

        for (Treasure treasure : treasures) {

            System.out.print(treasure.getName() + "- ");
            System.out.println(treasure.getCost() + "$");

        }

    }
}
