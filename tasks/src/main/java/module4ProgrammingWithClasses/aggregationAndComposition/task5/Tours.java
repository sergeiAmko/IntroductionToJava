package module4ProgrammingWithClasses.aggregationAndComposition.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Tours {

    private List<Tour> tours = new ArrayList<>();

    Path pathSource = Paths.get("tasks\\src\\main\\java",
            "module4ProgrammingWithClasses\\aggregationAndComposition\\task5\\sourceBook.txt");


    public Tours() {

        create();

    }

    private void create() {

        try (BufferedReader bufferedReader = Files.newBufferedReader(pathSource)) {

            String s;

            while ((s = bufferedReader.readLine()) != null) {

                String name;
                List<String> countries;
                List<String> cities;
                Type type;
                List<Transport> transports = new ArrayList<>();
                List<Food> foods = new ArrayList<>();
                int countDay;
                double cost;

                String[] sSplit = s.split(",\\s+");

                name = sSplit[0];

                countries = List.of(sSplit[1].split("\\s+"));

                cities = List.of(sSplit[2].split("\\s+"));

                type = Type.valueOf(sSplit[3].trim());

                String[] transportMassive = sSplit[4].split("\\s+");
                for (String item : transportMassive) {
                    transports.add(Transport.valueOf(item.trim()));
                }

                String[] foodMassive = sSplit[5].split("\\s+");
                for (String value : foodMassive) {
                    foods.add(Food.valueOf(value.trim()));
                }

                countDay = Integer.valueOf(sSplit[6]);

                cost = Double.valueOf(sSplit[7]);

                tours.add(new Tour(name, countries, cities, type, transports, foods, countDay, cost));


            }


        } catch (IOException e) {
            System.out.println("ERROR opening of file");
        }
    }

    public List<Tour> getCopyTours() {
        List<Tour> newTours = new ArrayList<>();

        newTours.addAll(tours);
        return newTours;
    }

    public List<Tour> getTours() {
        System.out.println(tours);
        return tours;
    }

    public static List<Tour> getToursByType(List<Tour> tours, Type type) {

        List<Tour> returned = new ArrayList<>();

        for (Tour tour : tours) {

            if (tour.getType().equals(type)) {
                returned.add(tour);
            }
        }

        return returned;
    }

    public static List<Tour> getToursByTransport(List<Tour> tours, Transport transport) {

        List<Tour> returned = new ArrayList<>();

        for (Tour tour : tours) {

            if (tour.getTransports().contains(transport)) {
                returned.add(tour);
            }
        }

        tours = returned;
        return returned;
    }

    public static List<Tour> getToursByFoods(List<Tour> tours, Food food) {

        List<Tour> returned = new ArrayList<>();

        for (Tour tour : tours) {
            if (tour.getFoods().contains(food)) {
                returned.add(tour);
            }
        }

        return returned;

    }

    public List<Tour> getToursByCountDays(List<Tour> tours, int countStart, int countEndInclude) {

        List<Tour> returned = new ArrayList<>();

        for (Tour tour : tours) {
            if (tour.getCountDay() >= countStart && tour.getCountDay() <= countEndInclude) {
                returned.add(tour);
            }
        }

        return returned;

    }

    public void sort(int number) {

        switch (number) {
            case 1:
                tours.sort(Comparator.comparing(Tour::getId));
                break;
            case 2:
                tours.sort(Comparator.comparing(Tour::getName));
                break;
            default:
                tours.sort(Comparator.comparing(Tour::getPrice));
                break;
        }

    }


}
