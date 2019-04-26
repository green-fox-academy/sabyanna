public class Sharpie {
    String color;
    float width;
    int inkAmount;

    @Override
    public String toString() {
        return "Sharpie{" +
                "color='" + color;
    }

    Sharpie(String color, float width, int inkAmount) {
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    public void use() {

        inkAmount--;
    }


    public  boolean isUsable() {

        return inkAmount != 0;
    }

}
