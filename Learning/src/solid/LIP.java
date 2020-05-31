package solid;

public class LIP {
    public static void main(String[] args) {
        Shape shape = new Ractangle(2, 5);
        System.out.println(shape.getSquere());

        Shape shape1 = new Square(5);
        System.out.println(shape1.getSquere());
    }
}

//don't change the behavior of a parent
//in this case add implementation for everyone entity, different and not dependent on a parent

interface Shape {
    int getSquere();
}

class Ractangle implements Shape{

    int height;
    int weight;

    public Ractangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int getSquere() {
        return height*weight;
    }
}

class Square implements Shape{

    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getSquere() {
        return side*side;
    }
}
