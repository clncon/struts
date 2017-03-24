package cn.itcast.struts.dao;

import java.io.Serializable;
import java.util.List;

import cn.itcast.struts.domain.User;

public interface UserDao {
	 /**
	  * ��ѯ���е��û���Ϣ
	  * @return
	  */
    public List<User> getAllUser();
    
      /**
       * 
       * ����ָ����id��ѯ�û�
       * @param id
       * @return
       */
    public User findUserByID(Serializable id);
     
      /**
       * ���û���Ϣ���б���
       * @param user
       */
     public void saveUser(User user);
     
     
      /**
       * ɾ���û���Ϣ
       * @param user
       */
     public void deleteUser(User user);
     
      /**
       * 
       * �����û���Ϣ
       * @param user
       */
     public void updateUser(User user);
     
     
      /**
       * ����ָ�����û�������������û�
       * @param username
       * @param password
       * @return
       */
     public  User getUserByUsernameAndPassword(String username,String password);
}
