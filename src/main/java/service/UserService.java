package service;

import java.io.FileNotFoundException;

public interface UserService {
	public void saveUser(int id, String name) throws FileNotFoundException;
}
