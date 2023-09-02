package DAO;

import MODEL.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<Users,Integer> {
    Users findByEmail(String email);
}
