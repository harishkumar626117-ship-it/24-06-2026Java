import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        System.out.println("Before clear: " + map);

        map.clear();

        System.out.println("After clear: " + map);
    }
}