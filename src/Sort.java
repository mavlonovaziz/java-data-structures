import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Sort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("bwvsdf","adsfsd"));

        Stream<String>stringStream;
        stringStream = list.stream().sorted();
        list.forEach(System.out::println);

            stringStream.forEach(System.out::println);
    }
}
