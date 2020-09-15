package gh;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Test {
    public static void main(String[] args) {
        Planet a = new Planet("Earth");

        System.out.println(a);
        System.out.println(a.getName());
    }

}

interface Nameable {
    public String getName();

    public void setName(String name);

}

class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                '}';
    }
}
