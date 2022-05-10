package ru.nshi.learn.work7;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.Integer.valueOf;

public class RReader {
    static String URL = "https://raw.githubusercontent.com/rassafel/java-learn/master/tasks/data/CAR_DATA.csv";
    static Map<String, Integer> HEADERS = new HashMap<>();
    static String DELIMITER = ",";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = getReader();
        HEADERS = readHeaders(reader);
        List<Car> cars = createList(reader, PARSE_CAR);
        Map<String, List<Car>> groupColor = cars.stream().collect(Collectors.groupingBy(Car::getColor));
        System.out.println(HEADERS);
        listInFile("cars", cars);
        mapInFile("groupColor", groupColor);
        Map<String, List<Car>> groupMaker = groupByMaker(cars);
        List<CarMaker> carMakers = mapToList(groupMaker);
        listInFile("carMaker", carMakers);
        System.out.println(carMakers.stream().map(CarMaker::getMaker).distinct().collect(Collectors.joining("\n")));
        groupMaker.entrySet().removeIf(entry -> countUniqueModels(groupMaker, entry.getKey()) < 2);
        carMakers = mapToList(new TreeMap<>(groupMaker));
        listInFile("sortingCarMaker", carMakers);
    }

    static BufferedReader getReader() throws IOException {
        java.net.URL url = new URL(RReader.URL);
        URLConnection connection = url.openConnection();
        return new BufferedReader(new InputStreamReader(connection.getInputStream()));
    }

    static List<Car> createList(BufferedReader reader, Function<String[], Car> function) throws IOException {
        List<Car> cars = new LinkedList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(DELIMITER);
            cars.add(function.apply(values));
        }
        return Collections.unmodifiableList(cars);
    }

    private final static Function<String[], Car> PARSE_CAR = (String[] values) -> {
        Car car = new Car();
        car.setCarModel(values[0]);
        car.setCarMaker(values[1]);
        car.setCarModelYear(valueOf(values[2]));
        car.setColor(values[3]);
        return car;
    };

    static Map<String, Integer> readHeaders(BufferedReader reader) throws IOException {
        Map<String, Integer> headers = new HashMap<>();
        String header = reader.readLine();
        String[] headersArray = header.split(DELIMITER);

        for (int i = 0; i < headersArray.length; i++) {
            headers.put(headersArray[i], i);
        }
        return headers;
    }

    static <T> void mapInFile(String nmFile, Map<String, List<T>> text) {
        try(FileWriter writer = new FileWriter(nmFile)) {
            writer.append(text.entrySet().stream().map(Objects::toString).collect(Collectors.joining("\n\n")));
            writer.flush();
        }
        catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static <T> void listInFile(String nmFile, List<T> text) {
        try(FileWriter writer = new FileWriter(nmFile)) {
            writer.append(text.toString());
            writer.flush();
        }
        catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static Map<String, List<Car>> groupByMaker(List<Car> cars){
        return cars.stream().collect(Collectors.groupingBy(Car::getCarMaker, Collectors.toList()));
    }

    static List<CarMaker> mapToList(Map<String, List<Car>> cars) {
        List<CarMaker> carMaker = new LinkedList<>();
        for(Map.Entry<String, List<Car>> entry: cars.entrySet()){
            for(int i = 0; i < entry.getValue().size(); i++){
                carMaker.add(new CarMaker(entry.getKey(), entry.getValue().get(i)));
            }
        }
        return carMaker;
    }

    static int countUniqueModels(Map<String, List<Car>> makeOfTheCar, String key){
        List<String> makers = new LinkedList<>();
        for (Car cars: makeOfTheCar.get(key)) {
            makers.add(cars.getCarModel());
        }
        return (new LinkedHashSet<>(makers)).size();
    }
}
