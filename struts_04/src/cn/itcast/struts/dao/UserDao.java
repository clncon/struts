package cn.itcast.struts.dao;

import java.io.Serializable;
import java.util.List;

import cn.itcast.struts.domain.User;

public interface UserDao {
	 /**
	  * 查询所有的用户信息
	  * @return
	  */
    public List<User> getAllUser();
    
      /**
       * 
       * 根据指定的id查询用户
       * @param id
       * @return
       */
    public User findUserByID(Serializable id);
     
      /**
       * 对用户信息进行保存
       * @param user
       */
     public void saveUser(User user);
     
     
      /**
       * 删除用户信息
       * @param user
       */
     public void deleteUser(User user);
     
      /**
       * 
       * 更新用户信息
       * @param user
       */
     public void updateUser(User user);
     
     
      /**
       * 根据指定的用户名和密码查找用户
       * @param username
       * @param password
       * @return
       */
     public  User getUserByUsernameAndPassword(String username,String password);
}
