import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HeavyBox heavyBox1 = new HeavyBox(2, 3,3,0.1);
        HeavyBox heavyBox2 = new HeavyBox(5, 10, 11, 0.2);
        HeavyBox heavyBox3 = new HeavyBox(4,5, 6, 7);
        HeavyBox heavyBox4 = new HeavyBox(1,1,1,1);
        HeavyBox heavyBox5 = new HeavyBox(3,4, 2, 1);

        ArrayList<HeavyBox> HBox = new ArrayList<>();

        HBox.add(heavyBox1);
        HBox.add(heavyBox2);
        HBox.add(heavyBox3);
        HBox.add(heavyBox4);
        HBox.add(heavyBox5);

        HeavyBox.newList(HBox);

    }
}