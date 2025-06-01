package tech.samiayoub.app1.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.samiayoub.app1.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);
    List<User> findByEmail(String email);
}
