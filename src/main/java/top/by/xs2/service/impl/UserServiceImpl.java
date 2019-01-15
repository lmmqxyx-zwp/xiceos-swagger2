package top.by.xs2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.by.xs2.dao.UserDao;
import top.by.xs2.entity.User;
import top.by.xs2.service.UserService;

/**
 * <p>Title: UserServiceImpl</p>
 * <p>Description: 业务处理实现类</p>
 *
 * @author zwp
 * @date 2019/1/15 16:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User insert(User user) {
        return userDao.save(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public User update(User user) {
        return userDao.save(user);
    }

    @Override
    public User select(Long id) {
        return userDao.findById(id).get();
    }
}
