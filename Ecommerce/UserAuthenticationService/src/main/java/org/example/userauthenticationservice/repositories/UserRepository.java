package org.example.userauthenticationservice.repositories;

import org.example.userauthenticationservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
     Optional<User> findByEmail(String email);

     User save(User user);

     Optional<User> findById(Long id);

}
