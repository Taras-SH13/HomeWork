package homework_shape;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public class Shape_Taste {


    public static void main(String[] args) {


        Triangle triangle1 = new Triangle(2, 2, 4, 6, 6, 4);
        System.out.println("Периметр треугольника " + triangle1.getPerimeter());
        System.out.println("Площадь треугольника " + triangle1.getArea());
        System.out.println(triangle1.toString());

        Triangle triangle2 = new Triangle(3, 4, 6, 8, 12, 78);
        System.out.println("Периметр треугольника " + triangle2.getPerimeter());
        System.out.println("Площадь треугольника " + triangle2.getArea());


        Rectangle rectangle1 = new Rectangle(2, 2, 10, 15);
        System.out.println("Периметр прямоугольника " + rectangle1.getPerimeter());
        System.out.println("Площадь прямоугольника " + rectangle1.getArea());
        System.out.println(rectangle1.toString());

        Circle circle1 = new Circle(3, 6, 10);
        System.out.println("Длинна окружности " + circle1.getPerimeter());
        System.out.println("Площадь круга " + circle1.getArea());


        SquarePyramid squarePyramid1 = new SquarePyramid(2, 56, 0, 6, 8);
        System.out.println("Объем пирамиды " + squarePyramid1.getVolume());
        System.out.println("Площадь граней квадратной пирамиды - " + squarePyramid1.getArea());

        Sphere sphere1 = new Sphere(34, 4, 56, 22);
        System.out.println("Объем сферы "+sphere1.getVolume());

        // создаем список объектов разлиных фигур
        List<Shape>shapes=new ArrayList<>();
        shapes.add(new Triangle(4,55,23,7,6,7));
        shapes.add(new Triangle(23,45,56,77,88,55));
        shapes.add(new Rectangle(23,11,345,555));
        shapes.add(new Circle(23,23,45));
        shapes.add(new SquarePyramid(113,33,5,34,666));
        shapes.add(new Cuboid(12,333,45,65,234,56));
        shapes.add(new SquarePyramid(119,36,5,334,6456));
        shapes.add(new Cuboid(100,33,4455,688,2348,562));

        for (Shape shape : shapes){
            System.out.println(shape.toString());

        }

    }



}
