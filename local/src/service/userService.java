package service;

import pojo.user;
import dao.userDao;

public class userService {

	userDao ud;
	
	
	
	public userDao getUd() {
		return ud;
	}



	public void setUd(userDao ud) {
		this.ud = ud;
	}



	public void saveuser(user u){
		
		ud.getHibernateTemplate().save(u);
	}
	
}
