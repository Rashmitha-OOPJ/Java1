package shapes;
class Shape {

public void draw() {
System.out.println("Drawing a shape&quot");
}

public void erase() {
System.out.println("Erasing a shape&quot");
}
}

class Circle extends Shape {

@Override
public void draw() {
System.out.println("Drawing a circle&quot");
}

@Override
public void erase() {
System.out.println("Erasing a circle&quot");
}
}

class Triangle extends Shape {

@Override
public void draw() {

System.out.println("Drawing a triangle&quot");
}

@Override
public void erase() {
System.out.println("Erasing a triangle&quot");
}
}

class Square extends Shape {

@Override
public void draw() {
System.out.println("Drawing a square&quot");
}

@Override
public void erase() {
System.out.println("Erasing a square&quot");
}
}

public class Shape {

public static void main(String[] args) {
Shape[] shapes = new Shape[3];
shapes[0] = new Circle();
shapes[1] = new Triangle();
shapes[2] = new Square();

for (int i = 0; i<shapes.length; i++) {


shapes[i].draw();
shapes[i].erase();
System.out.println("------------------------");
}
}
}