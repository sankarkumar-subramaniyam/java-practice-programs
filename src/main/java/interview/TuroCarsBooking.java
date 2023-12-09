package interview;

import java.util.Map;
import java.util.TreeMap;

public class TuroCarsBooking {

//    How many cars needed based on given booking requests ?
//            [ [0,22], [5,10], [15,20] ]

    TreeMap<Integer, Integer> carsRequired = new TreeMap<>();

    public static void main(String[] args) {
        TuroCarsBooking carsBooking = new TuroCarsBooking();

        carsBooking.requestCar(new int[]{0, 22});
        carsBooking.requestCar(new int[]{5, 10});
        carsBooking.requestCar(new int[]{15, 20});

        System.out.println("CarsRequired: " + carsBooking.getCarsRequired(18));

        carsBooking.requestCar(new int[]{5, 10});
        carsBooking.requestCar(new int[]{15, 26});
        System.out.println("CarsRequired: " + carsBooking.getCarsRequired(23));
    }

    void requestCar(int[] carRequest) {
        int startTime = carRequest[0];
        int endTime = carRequest[1];
        carsRequired.put(startTime, carsRequired.getOrDefault(startTime, 0) + 1);
        carsRequired.put(endTime, carsRequired.getOrDefault(endTime, 0) - 1);
    }

    int getCarsRequired(int time) {
        int totalCarsRequired = 0; // No need of any cars from pool

        for (Map.Entry req : carsRequired.entrySet()) {
            if ((Integer) req.getKey() < time)
                totalCarsRequired += (Integer) req.getValue();
        }

        return totalCarsRequired;
    }

}
