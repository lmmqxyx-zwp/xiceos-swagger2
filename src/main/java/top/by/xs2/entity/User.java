package top.by.xs2.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title: User</p>
 * <p>Description: 用户实体</p>
 *
 * @author zwp
 * @date 2019/1/8 15:53
 */
@Entity
@Table(name = "xs2_user")
public class User implements Serializable {

    //主键
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(length = 10)
    private Long id;
    //用户名称
    @Column(length = 32)
    private String userName;
    //用户密码
    @Column(length = 64)
    private String password;
    //用户邮箱
    @Column(length = 32)
    private String mail;
    //用户主页
    @Column(length = 255)
    private String url;
    //用户显示的名称
    @Column(length = 32)
    private String screenName;
    //用户注册时间
    private Date createTime;
    //最后活动时间
    private Date activateTime;
    //上次登录最后活跃时间
    private Date loginTime;
    //用户组
    @Column(length = 32, name = "xs2_group")
    private String group;
    //用户登录验证码
    @Column(length = 32)
    private String authCode;
    //记住登录状态
    @Column(length = 1)
    private Character remember;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getActivateTime() {
        return activateTime;
    }

    public void setActivateTime(Date activateTime) {
        this.activateTime = activateTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public Character getRemember() {
        return remember;
    }

    public void setRemember(Character remember) {
        this.remember = remember;
    }
}