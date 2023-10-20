/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsprakpbo;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author marti
 */
class Sosmed {
    public Sosmed() {
        
    }
    
    public enum ContentType{
        PICTURE,VIDEO
    }
    public enum ContentState{
        ARCHIVED,SHOWED,DELETED,PINNED
    }
    public class User{
        private String userId;
        private String username;
        private String password;
        private String bio;
        private ArrayList<Post> posts = new ArrayList<>();

        public User(String userId, String username, String password, String bio) {
            this.userId = userId;
            this.username = username;
            this.password = password;
            this.bio = bio;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public ArrayList<Post> getPosts() {
            return posts;
        }

        public void setPosts(ArrayList<Post> posts) {
            this.posts = posts;
        }
        
    }
    public class Post{
        private String postId;
        private ContentState status;
        private Date timeUpload;
        private ContentType postType;
        private ArrayList<Comment> comments = new ArrayList<>();

        public Post(String postId, ContentState status, Date timeUpload, ContentType postType) {
            this.postId = postId;
            this.status = status;
            this.timeUpload = timeUpload;
            this.postType = postType;
        }

        public String getPostId() {
            return postId;
        }

        public void setPostId(String postId) {
            this.postId = postId;
        }

        public ContentState getStatus() {
            return status;
        }

        public void setStatus(ContentState status) {
            this.status = status;
        }

        public Date getTimeUpload() {
            return timeUpload;
        }

        public void setTimeUpload(Date timeUpload) {
            this.timeUpload = timeUpload;
        }

        public ContentType getPostType() {
            return postType;
        }

        public void setPostType(ContentType postType) {
            this.postType = postType;
        }

        public ArrayList<Comment> getComments() {
            return comments;
        }

        public void setComments(ArrayList<Comment> comments) {
            this.comments = comments;
        }
        
    }
    public class Comment{
        private String commentId;
        private String text;
        private ContentState status;

        public Comment(String commentId, String text, ContentState status) {
            this.commentId = commentId;
            this.text = text;
            this.status = status;
        }

        public String getCommentId() {
            return commentId;
        }

        public void setCommentId(String commentId) {
            this.commentId = commentId;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public ContentState getStatus() {
            return status;
        }

        public void setStatus(ContentState status) {
            this.status = status;
        }
        
    }
    public class Reel extends Post{
        private int duration;
        private int playedCount;

        public Reel(int duration, int playedCount, String postId, ContentState status, Date timeUpload, ContentType postType) {
            super(postId, status, timeUpload, postType);
            this.duration = duration;
            this.playedCount = playedCount;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getPlayedCount() {
            return playedCount;
        }

        public void setPlayedCount(int playedCount) {
            this.playedCount = playedCount;
        }
        
    }
    public class Story extends Post{
        private int duration;
        private int views;

        public Story(int duration, int views, String postId, ContentState status, Date timeUpload, ContentType postType) {
            super(postId, status, timeUpload, postType);
            this.duration = duration;
            this.views = views;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getViews() {
            return views;
        }

        public void setViews(int views) {
            this.views = views;
        }
        
    }
    public class Feed extends Post{
        private String caption;
        private int likes;

        public Feed(String caption, int likes, String postId, ContentState status, Date timeUpload, ContentType postType) {
            super(postId, status, timeUpload, postType);
            this.caption = caption;
            this.likes = likes;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }
        
    }
    public void dummy(){
        User user1 = new User("1", "user1", "password1", "Bio1");

        Feed feed1 = new Feed("Caption1", 12, "1", ContentState.PINNED, new Date(), ContentType.PICTURE);
        Feed feed2 = new Feed("Caption2", 25, "2", ContentState.SHOWED, new Date(), ContentType.VIDEO);
        Feed feed3 = new Feed("Caption3", 36, "3", ContentState.ARCHIVED, new Date(), ContentType.PICTURE);

        Story story1 = new Story(15, 50, "4", ContentState.SHOWED, new Date(), ContentType.VIDEO);
        Story story2 = new Story(20, 67, "5", ContentState.PINNED, new Date(), ContentType.PICTURE);
        Story story3 = new Story(25, 80, "6", ContentState.DELETED, new Date(), ContentType.VIDEO);

        Reel reel1 = new Reel(27, 100, "7", ContentState.SHOWED, new Date(), ContentType.PICTURE);
        Reel reel2 = new Reel(36, 120, "8", ContentState.ARCHIVED, new Date(), ContentType.VIDEO);
        Reel reel3 = new Reel(30, 150, "9", ContentState.PINNED, new Date(), ContentType.PICTURE);

        user1.getPosts().add(feed1);
        user1.getPosts().add(feed2);
        user1.getPosts().add(feed3);
        user1.getPosts().add(story1);
        user1.getPosts().add(story2);
        user1.getPosts().add(story3);
        user1.getPosts().add(reel1);
        user1.getPosts().add(reel2);
        user1.getPosts().add(reel3);
       
    }
    public User getUserDummy() {
        return new User("1", "user1", "password1", "Bio1");
    }
    public void showUserPosts(User user) {
        System.out.println("User: " + user.getUsername());
        ArrayList<Post> posts = user.getPosts();
        for (Post post : posts) {
            System.out.println(post.toString());
        }
    }
    public void showPost(ArrayList<Post> posts, String postId) {
        for (Post post : posts) {
            if (post.getPostId().equals(postId)) {
                System.out.println("Post Details");
                System.out.println("ID: " + post.getPostId());
                System.out.println("Status: " + post.getStatus());
                System.out.println("Time Upload: " + post.getTimeUpload());
                System.out.println("Post Type: " + post.getPostType());
                if (post instanceof Feed) {
                    Feed feed = (Feed) post;
                    System.out.println("Caption: " + feed.getCaption());
                    System.out.println("Likes: " + feed.getLikes());
                } else if (post instanceof Story) {
                    Story story = (Story) post;
                    System.out.println("Duration: " + story.getDuration());
                    System.out.println("Views: " + story.getViews());
                } else if (post instanceof Reel) {
                    Reel reel = (Reel) post;
                    System.out.println("Duration: " + reel.getDuration());
                    System.out.println("Played Count: " + reel.getPlayedCount());
                }
                return;
            }
        }
        System.out.println("Post ID " + postId + " NOT FOUND");
    }
    public void changePostState(User user, String postId, ContentState currentStatus, ContentState newStatus) {
        for (Post post : user.getPosts()) {
            if (post.getPostId().equals(postId) && post.getStatus().equals(currentStatus)) {
                if (canChangeState(currentStatus, newStatus, post)) {
                    post.setStatus(newStatus);
                    System.out.println("Post ID " + postId + " CHANGED -> " + newStatus);
                } else {
                    System.out.println("ERROR");
                }
                return;
            }
        }
        System.out.println("Post ID " + postId + " NOT FOUND");
    }

    public boolean canChangeState(ContentState currentStatus, ContentState newStatus, Post post) {
        switch (currentStatus) {
            case SHOWED:
            case ARCHIVED:
                return newStatus == ContentState.ARCHIVED || newStatus == ContentState.PINNED;
            case PINNED:
                return false; 
            case DELETED:
                return false; 
            default:
                return false;
        }
    }
    
    public static void main(String[] args) {
        Sosmed sosmed = new Sosmed();
        sosmed.dummy();
        
        User user1 = sosmed.getUserDummy();
        sosmed.showUserPosts(user1);

        String postId = "2";  
        sosmed.showPost(user1.getPosts(), postId);

        String postId2 = "3";  
        ContentState currentStatus = ContentState.SHOWED;
        ContentState newStatus = ContentState.ARCHIVED;
        sosmed.changePostState(user1, postId2, currentStatus, newStatus);
    }
    
}
