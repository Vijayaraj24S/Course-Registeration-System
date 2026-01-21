package com.example.Course.Registeration.System.Repository;

import com.example.Course.Registeration.System.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<Users,Integer> {

    Users getByUsername(String username);
}
