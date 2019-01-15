package top.by.xs2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import top.by.xs2.entity.User;

/**
 * <p>Title: UserDao</p>
 * <p>Description: 用户数据库操作</p>
 *
 * @author zwp
 * @date 2019/1/15 16:53
 */
@Repository
@Component
public interface UserDao extends JpaRepository<User, Long> {
}
