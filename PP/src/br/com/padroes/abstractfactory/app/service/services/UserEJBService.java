package br.com.padroes.abstractfactory.app.service.services;

import javax.swing.*;

public class UserEJBService implements UserService {

	private UserEJBService(){

	}
	public static UserEJBService getInstance(){
		return new UserEJBService();
	}

	@Override
	public void save(String name) {
		System.out.println("Saving " + name + " through EJB's interface");
	}

	@Override
	public boolean delete(Integer id) {
		System.out.println("Removing User #" + id + " through EJB's interface");
		return true;
	}

}
