import Car.Cars;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Car.Cars> list = new ArrayList<>();

        Cars cars = new Cars("blur", "BMW", 253);
        Cars cars1 = new Cars("green", "Mercedes benz", 777);
        Cars cars2 =new Cars("red","nexia",111);
        Cars cars3 = new Cars("blue","onix",188);
        Cars cars4 =new Cars("black","Audi",444);
        Cars cars5 =new Cars("red","ferrari",111);
        Cars cars6 =new Cars("blur","nexia3",696);
        Cars cars7 =new Cars("black","cobalt",252);
        Cars cars8 =new Cars("red","ford",969);
        Cars cars9 =new Cars("blue","malibu",555);


        //List<Cars> list = Arrays.asList(cars,cars1,cars2,cars3,cars4,cars5,cars6,cars7,cars8,cars9);

        list.add(cars1);
        list.add(cars);
        list.add(cars2);
        list.add(cars3);
        list.add(cars4);
        list.add(cars5);
        list.add(cars6);
        list.add(cars7);
        list.add(cars8);
        list.add(cars9);



//        System.out.println(Arrays.toString(new List[]{list}) + "  ");
//        System.out.println();

        Main obj = new Main();
        System.out.println(obj.getRandomElement(list));
    }

    public Cars getRandomElement(List<Cars> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}

