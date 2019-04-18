package Creating.Blog;

import java.util.ArrayList;
import java.util.List;

public class Blog{


    Blog(){
        initializeBlog();
    }

    List<BlogPost> blogs = new ArrayList<>();




    void initializeBlog() {
        blogs.add(new BlogPost("John Doe", "Lorem ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04"));
        blogs.add(new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10"));
        blogs.add(new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28"));
    }

    List<BlogPost> returnBlog(){
        return blogs;
    }

    public void delete(int a) {
        List<BlogPost> newBlog = new ArrayList<>();
        for (int i = 0; i < blogs.size(); i++) {
            if (i != a) {
                newBlog.add(blogs.get(i));
            }
        }
        blogs = newBlog;
    }

    public void update(int a, BlogPost blog) {
        blogs.set(a, blog);
    }



}
