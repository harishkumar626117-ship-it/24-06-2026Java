import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Key " + i + " = " + map.get(i));
        }
    }
}