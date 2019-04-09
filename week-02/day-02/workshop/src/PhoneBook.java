import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class PhoneBook {
    public static void main(String[] args) {
        /*
        HashMap<String, String> phoneb = new HashMap<>() {{
            put("William A. Lathan", "405-709-1865");
            put("John K. Miller", "402-247-8568");
            put("Hortensia E. Foster", "606-481-6467");
            put("Amanda D. Newland", "319-243-5613");
            put("Brooke P. Askew", "307-687-2982");
        }};
         */
        HashMap<String, String> phoneb = new HashMap<>();
            phoneb.put("William A. Lathan", "405-709-1865");
            phoneb.put("John K. Miller", "402-247-8568");
            phoneb.put("Hortensia E. Foster", "606-481-6467");
            phoneb.put("Amanda D. Newland", "319-243-5613");
            phoneb.put("Brooke P. Askew", "307-687-2982");
            phoneb.put("Charlie", "307-687-2982");



        for (String key : phoneb.keySet()) {
            System.out.println(key + ": " + phoneb.get(key));
        }

        System.out.println("");

        System.out.println("John K. Miller's phone number is: " + phoneb.get("John K. Miller"));

        for (String key : phoneb.keySet()) {
            if (phoneb.get(key) == "307-687-2982") {
                System.out.println("307-687-2982 is the phone number of: " + key);
            }
        }

        if (phoneb.containsKey("Chris E. Myers")) {
            System.out.println(phoneb.get("Chris E. Myers"));
        } else {
            System.out.println("We do not know Chris E. Myers' phone number.");
        }

    }

}
