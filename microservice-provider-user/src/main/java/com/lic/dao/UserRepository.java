package com.lic.dao;

import com.lic.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author lichai
 * @description
 * @date 10:38 2018/12/26
 */
@Repository
public interface UserRepository  extends JpaRepository<User,Long>{
}
