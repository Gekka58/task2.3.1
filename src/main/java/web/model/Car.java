package web.model;

public class Car {

    private String series;
    private String model;
    private int number;

    public Car() {
    }

    public Car(String series, String model, int number) {
        this.series = series;
        this.model = model;
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series='" + series + '\'' +
                ", model='" + model + '\'' +
                ", number=" + number +
                '}';
    }
}
