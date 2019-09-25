package module4ProgrammingWithClasses.elementaryClassesAndObjects.task4;

import java.time.LocalTime;

public class Train {

    private String nameOfTheDestination;
    private int trainNumber;
    private LocalTime timeDeparture;

    public Train(String nameOfTheDestination, int trainNumber, LocalTime timeDeparture) {
        this.nameOfTheDestination = nameOfTheDestination;
        this.trainNumber = trainNumber;
        this.timeDeparture = timeDeparture;
    }

    public String getNameOfTheDestination() {
        return nameOfTheDestination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public LocalTime getTimeDeparture() {
        return timeDeparture;
    }

    @Override
    public String toString() {
        return "Train{" +
                "nameOfTheDestination='" + nameOfTheDestination + '\'' +
                ", trainNumber=" + trainNumber +
                ", timeDeparture=" + timeDeparture +
                '}' + "\n";
    }


}
