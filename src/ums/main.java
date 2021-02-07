package ums;

import ums.dao.UserDao;
import ums.dao.UserDaoImpl;
import ums.presentation.Console;
import ums.presentation.UserIo;
import ums.presentation.UserIoImpl;
import ums.service.Service;
import ums.service.ServiceImpl;

public class main {
	public static void main(String[] args) {
		String[] menuItem = {"LIST", "ADD", "UPDATE","DELETE"};
		
		UserDao userDao = new UserDaoImpl();
		Service service = new ServiceImpl(userDao);
		UserIo userIo = new UserIoImpl(service, menuItem);
		
		Console.info("Start UMS");
		userIo.play();
		Console.info("Exit UMS");
	}
}
