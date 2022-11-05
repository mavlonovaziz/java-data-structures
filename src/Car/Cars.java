package Car;

public class Cars {

    String color;
    String model;
    Integer number;

    public Cars(String color, String model, Integer number) {
        this.color = color;
        this.model = model;
        this.number = number;
    }



    @Override
    public String toString() {
        return "Cars{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", number=" + number +
                '}';
    }
}
