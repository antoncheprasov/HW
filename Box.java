public class Box {
    int width;
    int height;
    int depth;


    public Box(int w, int h, int d) {
        this.width = w;
        this.height = h;
        this.depth = d;

        print();

    }

    public Box(int w, int h) {
        this.width = w;
        this.height = h;
        this.depth = 10;

        print();

    }

    public Box(int w) {
        this.width = w;
        this.height = 12;
        this.depth = 10;

        print();

    }

    public Box() {
        this.width = 14;
        this.height = 12;
        this.depth = 10;

        print();

    }

    public void print() {

        System.out.println(width * height * depth);

    }

}

