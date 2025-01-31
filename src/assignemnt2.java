/* Assignment 2
My subject Area: 10. Social Media Platform
Post
User
SocialMedia */
/* import java.util.ArrayList;
import java.util.List;

public class assignemnt2 {
    class Post {
        private int id;
        private String content;
        private String author;
        private int likes;

        // Конструктор для инициализации поста
        public Post(int id, String content, String author) {
            this.id = id;
            this.content = content;
            this.author = author;
            this.likes = 0;
        }

        public int getId() { return id; }
        public String getContent() { return content; }
        public String getAuthor() { return author; }
        public int getLikes() { return likes; }

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
        public int hashCode() {
            return Integer.hashCode(id);
        }


        class User {
            private int id;
            private String username;

            public User(int id, String username) {
                this.id = id;
                this.username = username;
            }

            public int getId() {
                return id;
            }

            public String getUsername() {
                return username;
            }


            @Override
            public String toString() {
                return id + ": " + username;
            }

            @Override
            public boolean equals(Object obj) {
                return obj instanceof User && ((User) obj).id == this.id;
            }

            @Override
            public int hashCode() {
                return Integer.hashCode(id);
            }

            public static void main(String[] args) {
                // Создание объектов Pos
                Post post1 = new Post(1, "Just finished a 5K run! Feeling great, "Aruzhan");
                Post post2 = new Post(2, "Finally mastered recursion in Java. Time to celebrate", "Janerke");
                Post post3 = new Post(3, "Had the best coffee today. Who else loves cappuccinos", "Daniyar");
                Post post4 = new Post(4, "Exploring design patterns", "Salima");

                // Создание объектов User
                User user1 = new User(1, "Aruzhan");
                User user2 = new User(2, "Janerke");
                User user3 = new User(3, "Daniyar");
                User user4 = new User(4, "Salima");

                // Список постов
                List<Post> posts = new ArrayList<>();
                posts.add(post1);
                posts.add(post2);
                posts.add(post3);
                posts.add(post4);

                // Вывод постов
                System.out.println("All Posts:");
                for (Post post : posts) {
                    System.out.println(post);
                }

                // Сортировка постов по количеству лайков
                post1.like();
                post1.like();
                post3.like();
                posts.sort((p1, p2) -> Integer.compare(p2.getLikes(), p1.getLikes()));

                System.out.println("\nPosts sorted by likes:");
                for (Post post : posts) {
                    System.out.println(post);
                }

                // Сравнение объектов
                System.out.println("\nComparison:");
                System.out.println("post1 equals post2? " + post1.equals(post2));
            }
        }

        private void like() {
        }
    }
} */
