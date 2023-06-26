package com.genpact.copilot.userregistration.repository;

import com.genpact.copilot.userregistration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
