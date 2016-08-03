import java.util.Objects;

public class Circle {

    private final double radius;

    /**
     * @param radius - значение радиуса окружности
     */
    public Circle(double radius) {
        //Радиус не может быть отрицательным, для этого надо выбрасывать исключение  IllegalArgumentException
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        this.radius = Objects.requireNonNull(radius);
    }

    /**
     * @return Площадь окружности
     */
    public double squareCircle() {
        return Math.PI * radius * radius;
    }

    /**
     * Метод проверяющий равны ли окружности по площадям
     *
     * @param cir - объект окружности
     * @return true - окружности равны, false - окружности не равны
     */
    public boolean equalsCircle(Circle cir) {
        Objects.requireNonNull(cir);
        return this.squareCircle() == cir.squareCircle();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

}