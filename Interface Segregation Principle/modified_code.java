// Решение с использованием Interface Segregation Principle
//принцип разделения интерфейсов (Interface Segregation Principle), который заключается в том, что клиенты не должны зависеть от интерфейсов, 
//которые они не используют. Для этого были созданы два интерфейса: TwoDimensionalShape и ThreeDimensionalShape, которые содержат только те методы, 
//которые относятся к соответствующим фигурам. Также были созданы два класса: Circle и Cube, которые реализуют соответствующие интерфейсы.
//Класс Circle представляет круг и реализует метод area(), который возвращает площадь круга. Класс Cube представляет куб и реализует методы area() и 
//volume(), которые возвращают площадь и объем куба соответственно.
public interface TwoDimensionalShape {
    double area();
}

public interface ThreeDimensionalShape {
    double volume();
}

public class Circle implements TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}

public class Cube implements ThreeDimensionalShape, TwoDimensionalShape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}