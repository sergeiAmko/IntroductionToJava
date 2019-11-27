package module4ProgrammingWithClasses.aggregationAndComposition.task3;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */
public class Main {
    public static void main(String[] args) {

        Path pathSource = Paths.get("E:\\java\\projects\\IntroductionToJava\\tasks\\src\\main\\" +
                "java\\module4ProgrammingWithClasses\\aggregationAndComposition\\task3\\source.txt");

        Pattern patternArea = Pattern.compile("область");
        Pattern patternRegion = Pattern.compile("район");

        State state;

        try (BufferedReader bufferedReader = Files.newBufferedReader(pathSource)) {

            String s, area, region;

            s = bufferedReader.readLine();

            String stateName = s.substring(0, s.indexOf(" "));
            String stateCapital = s.substring(s.indexOf(" "));

            City areaCenter, regionCenter;
            List<Area> areaList = new ArrayList<>();

            while ((s = bufferedReader.readLine()) != null) {

                Matcher matcherArea;
                Matcher matcherRegion;

                s = s.trim();

                if ((matcherArea = patternArea.matcher(s)).find()) {

                    area = s.substring(0, matcherArea.start()).trim();
                    areaCenter = new City(s.substring(matcherArea.end()).trim());
                    areaList.add(new Area(area, areaCenter));

                } else if ((matcherRegion = patternRegion.matcher(s)).find()) {

                    region = s.substring(0, matcherRegion.start());
                    regionCenter = new City(s.substring(matcherRegion.end()).trim());
                    areaList.get(areaList.size() - 1).addRegion(new Region(region, regionCenter));

                } else {

                    areaList.get(areaList.size() - 1).getRegions().get(areaList.get(areaList.size() - 1).getRegions().size() - 1).addCity(new City(s.trim()));

                }


            }
            state = new State(stateName, areaList, new City(stateCapital), 25);

            System.out.println("Capital- " + state.getCapital());
            System.out.println("Count areas= " + state.getCountAreas());
            System.out.println("Area of state= " + state.getArea());
            System.out.println("Area centers: " + state.getAreaCenters());
        } catch (IOException e) {
            System.out.println("ERROR opening of file");
        }


    }


}
