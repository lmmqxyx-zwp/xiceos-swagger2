package top.by.xs2.service;

import top.by.xs2.entity.User;

/**
 * <p>Title: UserService</p>
 * <p>Description: 用户业务处理接口</p>
 *
 * @author zwp
 * @date 2019/1/15 16:54
 */
public interface UserService {

    /**
     * 增
     *
     * @param user
     * @return
     */
    User insert(User user);

    /**
     * 删
     *
     * @param user
     * @return
     */
    void delete(User user);

    /**
     * 改
     *
     * @param user
     * @return
     */
    User update(User user);

    /**
     * 查
     *
     * @param id
     * @return
     */
    User select(Long id);

}
