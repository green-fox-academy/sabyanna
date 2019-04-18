package Creating;

public class Main {
    public static void main(String[] args) {

        PostIt postIt1 = new PostIt("orange", "Idea 1", "blue");
        PostIt postIt2 = new PostIt("pink", "Awesome", "black");
        PostIt postIt3 = new PostIt("yellow", "Superb!", "green");

        BlogPost post1 = new BlogPost("John Doe", "Lorem ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04");
        BlogPost post2 = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10");
        BlogPost post3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28");


        Animal kecske = new Animal();

        Animal borz = new Animal();
        borz.play();
        borz.play();



        System.out.println(kecske.thirst);
        System.out.println(borz.thirst);


    }
}
