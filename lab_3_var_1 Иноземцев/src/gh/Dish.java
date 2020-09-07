package gh;

public abstract class Dish {
    protected String material;
    protected String color;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Plate extends Dish {
    private String size;

    public Plate(String material, String color, String size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Material = " + material + " Color = " + color + " Size = " + size;
    }
}

class Spoon extends Dish {
    private String type;

    public Spoon(String material, String color, String type) {
        this.material = material;
        this.color = color;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Material = " + material + " Color = " + color + " Type = " + type;
    }
}

class Test {
    public static void main(String[] args) {
        Plate a = new Plate("glass", "white", "200mm");

        a.setMaterial("plastick");

        System.out.println(a);

        Spoon b = new Spoon("silver","gray", "tea");

        System.out.println(b);
    }
}
