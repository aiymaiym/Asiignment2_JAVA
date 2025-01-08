import java.util.ArrayList;
import java.util.List;

public class draft{
    private static Entity userPost;

    abstract class Entity {
        private String id;

        public Entity(String id) {
            this.id = id;
        }
        public String getId() {
            return id;
        }

        public abstract void display();
    }
    static class Post {
        private int id;
        private String content;
        private String author;
        private int likes;

        // Constructor to initialize Post
        public Post(int id, String content, String author) {
            this.id = id;
            this.content = content;
            this.author = author;
            this.likes = 0;
        }

        public int getId() {return id;}
        public String getContent() {return content;}
        public String getAuthor() {return author;}
        public int getLikes() {return likes;}
        public void like() {likes++;}

        @Override
        public String toString() {
            return id + ": " + content + " (by " + author + ", likes: " + likes + ")";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Post post = (Post) obj;
            return id == post.id;
        }
        @Override
        public int hashCode() {return Integer.hashCode(id);}
    }

    static class User {
        private int id;
        private String username;

        public User(int id, String username) {
            this.id = id;
            this.username = username;}

        public int getId() {return id;}
        public String getUsername() {return username;}

        @Override
        public String toString() {
            return id + ": " + username;}

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            User user = (User) obj;
            return id == user.id;}

        @Override
        public int hashCode() {return Integer.hashCode(id);}
    }
    public class UserPost extends Entity {
        private String content;
        private String username;
        
        public UserPost(String id, String content, String username) {
            super(id);
            this.content = content;
            this.username = username;
        }
        public String getContent() {return content;}
        public String getUsername() {return username;}

        @Override
        public void display() {
            System.out.println("Post ID: " + getId() + ", Content: \"" + content + "\", By: " + username);
        }
    }
    
    public static void main(String[] args) {
        Post post1 = new Post(1, "Just finished a 5K run! Feeling great", "Aruzhan");
        Post post2 = new Post(2, "Finally mastered recursion in Java. Time to celebrate", "Janerke");
        Post post3 = new Post(3, "Had the best coffee today. Who else loves cappuccinos?", "Daniyar");
        Post post4 = new Post(4, "Exploring design patterns", "Salima");

        User user1 = new User(1, "Aruzhan");
        User user2 = new User(2, "Janerke");
        User user3 = new User(3, "Daniyar");
        User user4 = new User(4, "Salima");

        List<Post> posts = new ArrayList<>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);

        System.out.println("All Posts:");
        for (Post post : posts) {
            System.out.println(post);
        }

        post1.like();
        post1.like();
        post3.like();

        posts.sort((p1, p2) -> Integer.compare(p2.getLikes(), p1.getLikes()));

        System.out.println("\nPosts sorted by likes:");
        for (Post post : posts) {
            System.out.println(post);
        }
        System.out.println("\nComparison:");
        System.out.println("post1 equals post2? " + post1.equals(post2));
    }
}
