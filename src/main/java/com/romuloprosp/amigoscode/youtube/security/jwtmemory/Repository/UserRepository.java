package com.romuloprosp.amigoscode.youtube.security.jwtmemory.Repository;

import com.romuloprosp.amigoscode.youtube.security.jwtmemory.Entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
