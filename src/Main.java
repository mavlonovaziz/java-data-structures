import Car.Cars;

import javax.naming.ldap.SortControl;
import javax.naming.ldap.SortResponseControl;
import java.io.IOException;
import java.util.*;

import static java.lang.Math.E;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Cars> list = new ArrayList<>();

        Cars cars = new Cars("blur", "BMW", 253);
        Cars cars1 = new Cars("green", "Mercedes benz", 777);
        Cars cars2 = new Cars("red", "nexia", 111);
        Cars cars3 = new Cars("blue", "onix", 188);
        Cars cars4 = new Cars("black", "Audi", 444);
        Cars cars5 = new Cars("red", "ferrari", 111);
        Cars cars6 = new Cars("blur", "nexia3", 696);
        Cars cars7 = new Cars("black", "cobalt", 252);
        Cars cars8 = new Cars("red", "ford", 969);
        Cars cars9 = new Cars("blue", "malibu", 555);

        List<Cars> list1 = new ArrayList<>(5);
        Cars cars10 = new Cars("blue", "bmw2", 456);
        Cars cars11 = new Cars("red", "onix", 5858);
        Cars cars12 = new Cars("black", "royin", 858);//List<Cars> list = Arrays.asList(cars,cars1,cars2,cars3,cars4,cars5,cars6,cars7,cars8,cars9);
        Cars cars13 = new Cars("orange", "aff", 741);//List<Cars> list = Arrays.asList(cars,cars1,cars2,cars3,cars4,cars5,cars6,cars7,cars8,cars9);
        Cars cars14 = new Cars("dracula", "asd", 852);//List<Cars> list = Arrays.asList(cars,cars1,cars2,cars3,cars4,cars5,cars6,cars7,cars8,cars9);
        Cars cars15 = new Cars("dracon", "fgh", 963);//List<Cars> list = Arrays.asList(cars,cars1,cars2,cars3,cars4,cars5,cars6,cars7,cars8,cars9);

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

        list1.add(cars10);
        list1.add(cars11);
        list1.add(cars12);
        list1.add(cars13);
        list1.add(cars14);
        list1.add(cars15);



        System.out.println(Arrays.toString(new List[]{list}) + "  ");
        System.out.println();

        Main obj = new Main();
        System.out.println(obj.getRandomElement(list));

        list.addAll(0, list1);
        System.out.println(list + "  ?");

        list1.addAll(1, list);
        System.out.println(list1 + " |");

        list.retainAll(list1);
        System.out.println(list1 + "  ?");

        list.removeAll(list1);
        System.out.println(list1 + "  -");



    }

    public Cars getRandomElement(List<Cars> list) {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }


}

