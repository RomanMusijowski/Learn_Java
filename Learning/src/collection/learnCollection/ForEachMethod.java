package collection.learnCollection;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ForEachMethod {
    public static void main(String[] args) {
//        List<String> strings = Arrays.asList("one", "two", "three");
//        Stream<String> stream = Stream.of("abc", "java", "python");
//
//        Consumer<String> consumer = (String s) -> {
//            System.out.print(s + "= ");
//            for (int i = s.length()-1; i >= 0; i--) {
//                System.out.print(s.charAt(i) + " ");
//            }
//            System.out.println();
//        };

//        strings.forEach(consumer);
//        stream.forEach(consumer);

        ForEachMethod obj = new ForEachMethod();
        Path path = Paths.get("/..");
        obj.createDummyFiles().forEach(o -> obj.save(path, o));

    }

    private void save(Path path, DummyFile o) {
        try {
            int id = o.getId();
            // create a filename
            String fileName = id + ".txt";
            Files.write(path.resolve(fileName),
                    o.getContent().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<DummyFile> createDummyFiles() {
        return Arrays.asList(
                new DummyFile(1, "hello"),
                new DummyFile(2, "world"),
                new DummyFile(3, "java"));
    }

    class DummyFile {
        int id;
        String content;

        public DummyFile(int id, String content) {
            this.id = id;
            this.content = content;
        }

        public int getId() {
            return id;
        }

        public String getContent() {
            return content;
        }
    }
}
