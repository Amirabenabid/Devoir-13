package com.amira.produits.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.amira.produits.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}