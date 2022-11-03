package work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("guys");
        list.add("bro");
        list.add("apple");
        list.add("god");
        list.add("mod");
        list.add("one");
        list.add("two");
        list.add("teacher");
        list.add("purple");
        list.add(10,"Xolmat");
        list.add(0,"Aziz");
        list.remove(1);
        list.add(1,"Mavlonov");
        final var aziz = list.remove("Aziz");
        list.remove("Mavlonov");

        Iterator<String> itr = list.iterator(); {
          while(itr.hasNext()){
              String s = itr.next();
              System.out.println(s + " ");


          }
      }
    }
}
