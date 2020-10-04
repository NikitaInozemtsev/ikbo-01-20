package gh;

import java.util.Comparator;

public class Task1 {
    public static void main(String[] args) {
        ConcreteFactory a = new ConcreteFactory();

        System.out.println(a.createComplex());

        System.out.println(a.CreateComplex(10, 7));
    }
}

class Complex {
    private int real;
    private int image;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public Complex() {}

    public int getReal() {
        return real;
    }

    public int getImage() {
        return image;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Complex {" +
                "real=" + real +
                ", image=" + image +
                '}';
    }
}

interface ComplexAbstractFactory {
    public Complex createComplex();
    public Complex CreateComplex(int real, int image);
}

class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex(real, image);
    }
}