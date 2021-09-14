package collection.learnCollection;


import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
//        List<String> strings = new ArrayList<>();
//        List<String> toRemove = new ArrayList<>();
//        strings.add("1");
//        strings.add("2");
//        strings.add("3");
//        strings.add("4");
//        strings.add(null);
//        strings.add(null);

        //FOREACH
//        strings.forEach(System.out::println);

//        LAMBDA
//        strings.stream()
//                .filter(Objects::nonNull)
//                .forEach(System.out::println);

//        System.out.println(strings);

        // JUST test
//        ListIterator<String> listIterator = strings.listIterator();
//        while (listIterator.hasNext()) {
//            listIterator.next();
//            listIterator.remove();
//        }

//        WITHOUT iterator.next() throw exception
//        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()) {
//
////            iterator.next();
//            iterator.remove();
//        }



//          THROW ConcurrentModificationException sth with modCount
//        for (String string : strings) {
//            strings.remove(1);
//        }



        // HOW TO REMOVE WITH VALUE CHECK
//        for (Iterator<String> intr = strings.iterator(); intr.hasNext();) {
//            String next = intr.next();
//            if ( next != null && next.equals("3")) {
//                intr.remove();
//            }
//        }


//        removeAll test
//        for (String string : strings) {
//            if ( string != null && string.equals("3")) {
//                toRemove.add(string);
//            }
//        }
//        strings.removeAll(toRemove);


//        removeIf test
//        strings.removeIf(value -> value != null && value.equals("3"));


//        Remove with stream
//        List<String> collect = strings.stream()
//                .filter(Objects::nonNull)
//                .filter(v -> !v.equals("3"))
//                .collect(Collectors.toList());
//        System.out.println(collect);





//        System.out.println(strings);

        //final
//        final List<String> finals = new ArrayList<>();
//        final List<String> finalsAddAll = new ArrayList<>(strings);
//
//        finals.add("1");
//        finals.add("2");
//
//        finalsAddAll.add("5");
//        finalsAddAll.add("6");
//
//        System.out.println(finals);
//        System.out.println(finalsAddAll);


//        THROW UnsupportedOperationException, THE collection is immutable
//        List<Integer> integers = List.of(1, 2, 3);
//        System.out.println(integers);
//        integers.add(88);
//        System.out.println(integers);




        LearnArrayList list = new LearnArrayList();
        list.useComparator();
    }

    public void useComparator() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "one", true));
        users.add(new User(2, "two", false));
        users.add(new User(3, "three", true));
        users.add(new User(4, "four", false));
        users.add(new User(5, "five", true));

//        users.forEach(System.out::println);
//        System.out.println();

//        users.sort(Comparator.comparingInt(User::getId).reversed());
//        users.sort((User a, User b) -> a.getName().compareTo(b.getName()));
//        users.forEach(System.out::println);

//        users.stream()
////                .sorted(Comparator.comparing(User::getName).reversed())
//                .sorted(Comparator.comparing(User::isActive).reversed())
//                .forEach(System.out::println);

        //INTERFACE JUST IGNOR IT
//        Consumer<User> consumer = User::getName;
//        users.forEach(consumer);


//        USE FUNCTION TO MAP USER TO STRING
//        Function<User, String> function = (u) -> u.toString();
//        List<String> userNames = users.stream().map(function).collect(Collectors.toList());
//        userNames.forEach(System.out::println);

    }

    class User{
        int id;
        String name;
        boolean active;

        public User(int id, String name, boolean active) {
            this.id = id;
            this.name = name;
            this.active = active;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", active=" + active +
                    '}';
        }
    }
}
