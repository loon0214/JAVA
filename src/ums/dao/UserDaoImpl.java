package ums.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ums.domain.User;

public class UserDaoImpl implements UserDao {
	private List<User> users;
	private int userNoSeq;
	
	public UserDaoImpl() {
		this.users = new ArrayList<User>();
	}

	@Override
	public List<User> getUsers() {
		return users;
	}

	@Override
	public User getUser(int userNo) {
		User user = null;
		for(User tmp:users) {
			if(tmp.getUserNo()==userNo) {
				user = tmp;
				break;
			}
		}
		return user;
	}

	@Override
	public boolean addUser(String userName) {
		return users.add(new User(++userNoSeq, userName, LocalDate.now()));
	}

	@Override
	public boolean updateUser(User user) {
		int userNo = user.getUserNo();
		
		boolean isModified = false;
		for(User tmp:users) {
			if(tmp.getUserNo()==userNo) {
				tmp.setUserName(user.getUserName());
				tmp.setRegDate(LocalDate.now());
				isModified = true;
			}
		}
		return isModified;
	}

	@Override
	public boolean delUser(int userNo) {
		boolean isDel = false;
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getUserNo()==userNo)
				isDel = users.remove(users.get(i));
		}
		return isDel;
	}
}