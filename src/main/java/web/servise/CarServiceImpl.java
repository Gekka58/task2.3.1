package web.servise;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList;
        {
            carList = new ArrayList<>();
            carList.add(new Car("Rio", "Kia", 2010));
            carList.add(new Car("Cerato", "Kia", 2014));
            carList.add(new Car("LX570", "Lexus", 2016));
            carList.add(new Car("Camry", "Toyota", 2018));
            carList.add(new Car("301", "Peugeot", 2017));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
