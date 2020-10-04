package gh;

public class Task2 {
    public static void main(String[] args) {
        Client a = new Client();

        ChairFactory ch = new ChairFactory();

        a.setChair(ch.createMagicChair());
        a.sit();

        a.setChair(ch.createVictorianChair());
        a.sit();

        a.setChair(ch.createFunctionalChair());
        a.sit();
    }
}

interface Chair {}

class VictorianChair implements Chair {
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "VictorianChair " +
                "age=" + age;
    }
}

class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Magic chair is doing magic...");
    }

    @Override
    public String toString() {
        return "MagicChair";
    }
}

class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "FunctionalChair";
    }
}

interface AbstractChairFactory {
    public  VictorianChair createVictorianChair();
    public MagicChair createMagicChair();
    public FunctionalChair createFunctionalChair();
}

class ChairFactory implements AbstractChairFactory {
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(157);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}

class Client {
    public Chair chair;

    public void sit() {
        System.out.println("Sitting on " + chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}