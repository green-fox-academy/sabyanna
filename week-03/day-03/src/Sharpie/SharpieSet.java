package Sharpie;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    List<Sharpie> sharpieSet = new ArrayList<>();

    SharpieSet() {
        initializeSharpieset();
    }

    public List<Sharpie> getSharpieSet() {

        return sharpieSet;
    }


    public int countUsable() {
        int Usable = 0;

        for (int i = 0; i < sharpieSet.size(); i++) {
            if ((sharpieSet.get(i)).isUsable()) {
                Usable++;
            }
        }
        return Usable;
    }

    public void removeTrash() {
        List<Sharpie> newSharpieSet = new ArrayList<>();
        for (int i = 0; i < sharpieSet.size(); i++) {
            if (((this.sharpieSet.get(i)).isUsable())) {
                newSharpieSet.add(this.sharpieSet.get(i));
            } else {

            }
        }
        sharpieSet = newSharpieSet;

    }

     void initializeSharpieset() {
        sharpieSet.add(new Sharpie("blue", 0.3f, 100));
        sharpieSet.add(new Sharpie("pink", 0.3f, 0));
        sharpieSet.add(new Sharpie("green", 0.3f, 0));
        sharpieSet.add(new Sharpie("kfd", 0.3f, 20));
        sharpieSet.add(new Sharpie("red", 0.3f, 0));
        sharpieSet.add(new Sharpie("black", 0.3f, 20));
        sharpieSet.add(new Sharpie("white", 0.3f, 0));
        sharpieSet.add(new Sharpie("dirt", 0.3f, 0));

    }





}
