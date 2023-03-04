package com.javadeveloper.rest.api.repo;

import com.javadeveloper.rest.api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ari Abdul Majid
 * @version :$, (Created on 04/03/2023)
 * @since 1.0.Alpha1
 */
public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
