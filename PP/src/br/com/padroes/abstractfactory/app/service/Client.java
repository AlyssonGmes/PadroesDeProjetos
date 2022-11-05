package br.com.padroes.abstractfactory.app.service;


import br.com.padroes.abstractfactory.app.service.factory.ServiceFactory;
import br.com.padroes.abstractfactory.app.service.factory.UserServiceFactory;
import br.com.padroes.abstractfactory.app.service.services.UserEJBService;

public class Client {

    public static void main(String[] args) {

        ServiceFactory sf = new ServiceFactory();
        sf.save("sFactory");
        UserServiceFactory usf = (UserServiceFactory) sf.create("User");
        usf.save("uServiceFactory");
        UserEJBService uEJBS = (UserEJBService) usf.create("UserEJBService");
        uEJBS.save("uEJBService");

    }
}
