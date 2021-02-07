package ums.service;

import java.util.List;
import ums.domain.User;

public interface Service {
	List<User> listUsers();
	User findUser(int userNo);
	boolean join(String userName);
	boolean correctUser(User user);
	boolean secede(int userNo);
}