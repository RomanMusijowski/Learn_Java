package collection.lamdaAndFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User(1, "one", false),
                new User(2, "two", true),
                new User(3, "three", false),
                new User(4, "four", true),
                new User(5, "five", true));

//        List<User> filteredUsers = Main.filter(users, (x1) -> x1.getId() != 1);

        List<User> filteredUsers = Main.filter(users, User::isActive);
        filteredUsers.forEach(System.out::println);



//        REFERENCE TO A STATIC METHOD
//        List<String> strings = Arrays.asList("one", "on2", "on3", "on4");
//        strings.forEach(StringUtils::capitalize);
//        strings.forEach(System.out::println);

//        REFERENCE TO A METHOD OF A TYPE
//        List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
//        Stream<Integer> sorted = numbers.stream()
//                .sorted(Integer::compareTo);
//        sorted.forEach(System.out::println);


//        REFERENCE TO A CONSTRUCTOR
//        List<String> bikeBrands = Arrays.asList("Giant", "Scott", "Trek", "GT");
//        User[] users1 = bikeBrands.stream()
//                .map(User::new)
//                .toArray(User[]::new);
//        Arrays.stream(users1).forEach(System.out::println);

    }

    public static <T> List<T> filter(List<T> list, Filter<T> predicate) {
        if (list == null) {
            throw new IllegalArgumentException("Null!");
        }
        List<T> filtered = new ArrayList<>();
        for (T t : list) {
            if (t!=null && predicate.test(t)) filtered.add(t);
        }
        return filtered;
    }
}
