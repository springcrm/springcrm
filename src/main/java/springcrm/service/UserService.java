package springcrm.service;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springcrm.entity.UserEO;

@Service
public class UserService {
	@Autowired
	private SessionFactory sessionFactory;

	public void insertUser()
	{
		UserEO user = new UserEO();
		user.setId(2L);
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		
		System.out.println("save user");
	}
	
}
