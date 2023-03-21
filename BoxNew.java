public class BoxNew {
    int length;
    int width;
    int height;

    public BoxNew(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("Объём коробки: " + this.getVolume());
    }

    public BoxNew(int length, int width) {
        this(length, width, 5);
        System.out.println("Объём коробки: " + this.getVolume());
    }

    public BoxNew(int length) {
        this(length, 5, 5);
        System.out.println("Объём коробки: " + this.getVolume());
    }

    public BoxNew() {
        this(5, 5, 5);
        System.out.println("Объём коробки: " + this.getVolume());
    }

    public int getVolume() {
        return length * width * height;
    }
}

