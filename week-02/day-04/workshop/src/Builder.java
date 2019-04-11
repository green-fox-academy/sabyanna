public class Builder {
    public static void main(String[] args) {
        int i = 1;
        StringBuilder sbf = new StringBuilder("kecske");
        String result = sbf.substring(0,i) + "*" + sbf.substring(i, sbf.length());
        System.out.println(result);
        }

    }

