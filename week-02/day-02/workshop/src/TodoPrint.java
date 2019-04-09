public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";

        String beg = "My todo:\n";

        String download = " - Download games\n";
        String diablo = "    - Diablo\n";

        String done = beg+todoText+download+diablo;
        System.out.println(done);



        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo


    }
}
//© 2019 GitHu