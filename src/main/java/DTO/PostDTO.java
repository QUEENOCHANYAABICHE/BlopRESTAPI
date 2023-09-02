package DTO;

import MODEL.Comments;
import MODEL.Posts;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {
    private int id;
    private String title;
    private String content;
    private String category;
    private Integer likes;
    private String createdAt;
    private String updatedAt;
    private List<Comments> comments;

    public PostDTO(List<Comments> comments, Posts posts){
       this.id= posts.getPostId();
       title= posts.getTitle();
       content=posts.getCategory();
       category=posts.getCategory();
       likes=posts.getLikes();
       createdAt=String.valueOf(posts.getCreatedAt());
       updatedAt= String.valueOf(posts.getUpdatedAt());
       this.comments = comments;
    }

}
