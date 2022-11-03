package br.com.padroes.abstractfactory.app.service.factory;

import br.com.padroes.abstractfactory.app.service.services.UserEJBService;
import br.com.padroes.abstractfactory.app.service.services.UserRestApiService;
import br.com.padroes.abstractfactory.app.service.services.UserService;

public class UserServiceFactory implements ServicesAbstractFactory, UserService {
    UserService userService;

    public UserServiceFactory() {

    }

    public void createUserEJBService() {
        this.userService = new UserEJBService();
    }

    public void createUserRestApiService() {
        this.userService = new UserRestApiService();
    }

    public UserService getUserService() {
        return userService;
    }

    @Override
    public void save(String model) {
        System.out.println("Saving " + model + " car through UserServiceFactory");
    }


    @Override
    public boolean delete(Integer id) {
        System.out.println("Removing User #" + id + " through UserServiceFactory");
        return true;
    }
}
