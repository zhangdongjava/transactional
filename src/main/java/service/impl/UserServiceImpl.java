package service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.log.LogDao;
import dao.user.UserDao;
import service.UserService;

@Service
@Transactional
public class UserServiceImpl implements  UserService {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private LogDao logDao;
	
	@Transactional
	public void saveUser(int id, String name) throws FileNotFoundException {
		userDao.insertUser(id, name);
		logDao.insertLog(id, id + "_" + name);
	}

	
}
