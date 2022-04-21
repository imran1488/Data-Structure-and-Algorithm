import javax.sound.sampled.SourceDataLine;

class Shape {
    String Colour;

    public void typeof(String Color) {
        System.out.println("The Colour of the shape is " + Color);
    }

    public void area() {
        System.out.println("display area");
    }
}

class Square extends Shape {

    public void area(int l, int h) {
        System.out.println(1 * l * h);
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.area();
        s1.Colour = "red";
        s1.typeof(s1.Colour);
    }

}
