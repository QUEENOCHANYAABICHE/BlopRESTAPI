package DAO;

import MODEL.Posts;
import MODEL.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostDAO extends JpaRepository<Users, Integer> {
@Query(value = "SELECT * FROM posts q ORDER BY q.id DESC", nativeQuery = true)
List<Posts> findByKeyWord(String keyword);

Posts findByCategory(String category);

Posts findByPostId(Integer id);
}
