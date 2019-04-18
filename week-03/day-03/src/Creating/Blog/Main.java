package Creating.Blog;

public class Main {
    public static void main(String[] args) {

        Blog myBlog = new Blog();
        System.out.println(myBlog.returnBlog());

        myBlog.delete(1);
        System.out.println(myBlog.returnBlog());

        BlogPost newpost = new BlogPost("Én", "Lorem ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04");


        myBlog.update(1, newpost);
        System.out.println(myBlog.returnBlog());

    }



}
