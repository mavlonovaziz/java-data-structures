import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sort {
    public static void main(String[] args) {
        Set<User> userSet = new TreeSet<>(List.of(new User(22, "Tramp"), new User(25, "FT9")));
        List<User> userList =userSet.stream().distinct().collect(Collectors.toList());
        Stream<User> userStream = userSet.stream().sorted(Comparator.comparing(User::getShortName));
        userStream.forEach(user -> System.out.println(user.toString()));
    }
}
