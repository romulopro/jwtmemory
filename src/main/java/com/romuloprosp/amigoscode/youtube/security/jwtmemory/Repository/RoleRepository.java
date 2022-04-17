package com.romuloprosp.amigoscode.youtube.security.jwtmemory.Repository;

import com.romuloprosp.amigoscode.youtube.security.jwtmemory.Entity.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
    Role findByName(String username);
}
