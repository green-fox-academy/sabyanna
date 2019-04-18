import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {
    public static void main(String[] args) {

        // Create a method that find the 5 most common lottery numbers in lottery.csv

        uniques("lottery.csv");
    }

    public static void uniques(String fileName) {
        Path file = Paths.get(fileName);

        try {
            List<String> originalData = Files.readAllLines(file);
            List<String> numbers = new ArrayList<>();
            for (String s : originalData) {
                String[] lines = s.split(";");
                for (int i = 11; i <16; i++) {
                    numbers.add(lines[i]);
                }

            }
            Map<String, Integer> counts = new HashMap<>();

            for (String nr: numbers) {
                if (counts.containsKey(nr)) {
                    counts.put(nr, counts.get(nr)+1);
                } else {
                    counts.put(nr, 1);
                }
            }

            System.out.println(counts.toString());

            Iterator iter = counts.entrySet().iterator();


/*
            Iterator iter = counts.entrySet().iterator();
            int bigNr1 = 0;
            String bigInd1 = "";

            int bigNr2 = 0;
            String bigInd2 = "";

            int bigNr3 = 0;
            String bigInd3 = "";

            int bigNr4 = 0;
            String bigInd4 = "";

            int bigNr5 = 0;
            String bigInd5 = "";

            while(iter.hasNext()){
                Map.Entry mapElement = (Map.Entry)iter.next();
                if ((int)(mapElement.getValue()) > bigNr1) {
                    bigNr1 = (int)(mapElement.getValue());
                    bigInd1 = (mapElement.getKey()).toString();
                }
                if (((int)(mapElement.getValue()) > bigNr2) && (((int)(mapElement.getValue()) != bigNr1))) {
                    bigNr2 = (int)(mapElement.getValue());
                    bigInd2 = (mapElement.getKey()).toString();
                }

                if (((int)(mapElement.getValue()) > bigNr3) && (((int)(mapElement.getValue()) != bigNr2)) && (((int)(mapElement.getValue()) != bigNr1))) {
                    bigNr3 = (int)(mapElement.getValue());
                    bigInd3 = (mapElement.getKey()).toString();
                }
                if (((int)(mapElement.getValue()) > bigNr4) && (((int)(mapElement.getValue()) != bigNr3))&& (((int)(mapElement.getValue()) != bigNr2)) && (((int)(mapElement.getValue()) != bigNr1))) {
                    bigNr4 = (int)(mapElement.getValue());
                    bigInd4 = (mapElement.getKey()).toString();
                }
                if (((int)(mapElement.getValue()) > bigNr5) && (((int)(mapElement.getValue()) != bigNr4)) && (((int)(mapElement.getValue()) != bigNr3))&& (((int)(mapElement.getValue()) != bigNr2)) && (((int)(mapElement.getValue()) != bigNr1))) {
                    bigNr5 = (int)(mapElement.getValue());
                    bigInd5 = (mapElement.getKey()).toString();
                }


            }

            System.out.println(bigInd1);
            System.out.println(bigInd2);
            System.out.println(bigInd3);
            System.out.println(bigInd4);
            System.out.println(bigInd5);


 */


        } catch (IOException e) {
            System.out.println("nope");
        }
    }




}
