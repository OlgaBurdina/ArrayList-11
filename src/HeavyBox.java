import java.util.ArrayList;

public class HeavyBox {
    private int depth;
    private int length;
    private int width;
    private double weight;

    public HeavyBox (int depth, int length, int width, double weight) {
        this.depth = depth;
        this.weight = weight;
        this.length = length;
        this.width = width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String toString() {
        return  "Тяжелая коробка: " +
                " вес - " + weight + "," +
                " ширина - " + width + "," +
                " глубина - " + depth + "," +
                " длина - " + length;
    }

    ArrayList<HeavyBox> HBox = new ArrayList<>();
    public static void newList(ArrayList<HeavyBox> HBox) {
        for (HeavyBox heavybox: HBox)
            if (heavybox.getWeight() > 0.3) {
                ArrayList<HeavyBox> HBox1 = new ArrayList<>();
                HBox1.add(heavybox);
                HBox1.forEach(System.out :: println);
            }
    }

}
