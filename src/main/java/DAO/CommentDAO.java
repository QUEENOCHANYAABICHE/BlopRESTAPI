package DAO;

import MODEL.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentDAO extends JpaRepository<Comments, Integer> {

    @Query(value = "SELECT * FROM comments q ORDER BY q.comment_id DESC", nativeQuery = true)
    List<Comments> findByKeywords(String keyword);

    List<Comments> findByPostId(Integer id);
}
