package patterns.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("2.3","256", "64")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(computer.toString());
    }
}
