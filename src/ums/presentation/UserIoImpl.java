package ums.presentation;

import java.util.List;

import ums.domain.User;
import ums.domain.UserJob;
import ums.service.Service;

public class UserIoImpl implements UserIo {
	private Service service;
	private String[] menuItem;
	private String menu = "";
	
	public UserIoImpl(Service serivce, String[] menuItem) {
		this.service = service;
		
		this.menuItem = menuItem;
		for(int i=0; i<menuItem.length; i++)
			this.menu += (i + 1) + ", " + menuItem[i] +", ";
		this.menu += "0. EXIT";
	}

	@Override
	public void play() {
		int choice = 0;
		while((choice = choose())!=0) {
			switch(choice) {
			case UserJob.LIST: this.listUsers(); break;
			case UserJob.ADD: this.join(); break;
			case UserJob.UPDATE: this.correctUser(); break;
			case UserJob.DEL: this.secede(); break;
			}
		}
	}
	
	private int choose() {
		boolean isMenuNum = false;
		int choice = 0;
		do {
			Console.in(menu);
			choice = Console.inNum();
			if(choice < 0 || choice > menuItem.length)
				Console.info("Enter the Exist menu No");
			else isMenuNum = true;
		} while(!isMenuNum);
		return choice;
	}

	@Override
	public void listUsers() {
		List<User> users = service.listUsers();
		if(users.size()!=0)
			for(User user:users)
				Console.info(user);
		else
			Console.info("User is not exist");
	}

	@Override
	public void join() {
		Console.in("Enter the user Name to Create");
		String userName = Console.inStr();
		if(userName.equals("0")) {
			Console.info("cancle the add user");
			return;
		}
		if(service.join(userName))
			Console.info("success add user");
		else
			Console.info("failed add user");
	}

	@Override
	public void correctUser() {
		if(service.listUsers().size()==0) {
			Console.info("user is not exist");
			return;
		}
		
		User user = null;
		do {
			Console.in("Enter the user number to modify");
			int userNo = Console.inNum();
			if(userNo == 0) {
				Console.info("cancle update user info");
				return;
			}
			user = service.findUser(userNo);
			if(user==null)
				Console.info("typed number user isnt exist");
		}while(user == null);
		
		Console.in("type the user Name");
		user.setUserName(Console.inStr());
		if(service.correctUser(user))
			Console.info("success update user info");
		else
			Console.info("failed update user info");
	}

	@Override
	public void secede() {
		if(service.listUsers().size()==0) {
			Console.info("user is not exist");
			return;
		}
		User user =null;
		int userNo = 0;
		
		do {
			Console.in("Enter the userNo to DELETE");
			userNo = Console.inNum();
			if(userNo==0) {
				Console.info("cancle the DELETE user");
				return;
			}
			user = service.findUser(userNo);
			if(user == null)
				Console.info("typed number user isnt exist");
		}while(user == null);
		
		if(service.secede(userNo))
			Console.info("success DELETE user");
		else
			Console.info("failed DELETE user");
	}

}
