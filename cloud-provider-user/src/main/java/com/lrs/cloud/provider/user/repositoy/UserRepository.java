package com.lrs.cloud.provider.user.repositoy;

import com.lrs.cloud.provider.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
