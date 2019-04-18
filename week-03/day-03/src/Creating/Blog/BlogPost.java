package Creating.Blog;

public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    @Override
    public String toString() {
        return authorName;
    }


    BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }
}
