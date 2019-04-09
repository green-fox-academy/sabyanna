import java.util.HashMap;

public class MapIntro2 {
    public static void main(String[] args) {
        HashMap<String, String> ISBN = new HashMap<>();
        ISBN.put("978-1-60309-452-8", "A Letter to Jo");
        ISBN.put("978-1-60309-459-7", "Lupus");
        ISBN.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        ISBN.put("978-1-60309-461-0", "The Lab");

        for (String key : ISBN.keySet()) {
            System.out.println(ISBN.get(key) + " (" + key + ")");
        }

        System.out.println("");

        ISBN.remove(978-1-60309-444-3);

        for (String key : ISBN.keySet()) {
            if (ISBN.get(key) == "The Lab") {
                ISBN.remove(key);
            }
        }

        for (String key : ISBN.keySet()) {
            System.out.println(ISBN.get(key) + " (" + key + ")");
        }

        ISBN.put("978-1-60309-450-4", "They Called Us Enemy");
        ISBN.put("978-1-60309-453-5", "Why Did We Trust Him?");

        if (ISBN.containsKey(478-0-61159-424-8)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        for (String key : ISBN.keySet()) {
            System.out.println(ISBN.get(key) + " (" + key + ")");
        }

        System.out.println(ISBN.get("978-1-60309-453-5"));

    }
}
