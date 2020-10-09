package dao;


import fr.istic.m2.TP1_TAA.User;



public class UserDao extends AbstractJpaDao<Long, User>{
	
	public UserDao() {
		this.setClazz(User.class);
	}
	
}
