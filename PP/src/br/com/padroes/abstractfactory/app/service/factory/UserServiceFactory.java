package br.com.padroes.abstractfactory.app.service.factory;

import br.com.padroes.abstractfactory.app.service.services.UserEJBService;
import br.com.padroes.abstractfactory.app.service.services.UserRestApiService;

public class UserServiceFactory<T> implements ServicesAbstractFactory {

    private UserServiceFactory() {

    }

    @Override
    public T create(String servico) {
        if (servico.equalsIgnoreCase("UserEJBService")) {
            return (T) UserEJBService.getInstance();
        } else if (servico.equalsIgnoreCase("UserRestApiService")) {
            return (T) UserRestApiService.getInstance();
        } else {
            System.out.println("Serviço indisponível.");
            return null;
        }
    }

    public static UserServiceFactory getInstance(){
        return new UserServiceFactory();
    }
    @Override
    public void save(String model) {
        System.out.println("Saving " + model + " user through UserServiceFactory");
    }

    @Override
    public void update(String newModel) {

    }

    @Override
    public boolean delete(Integer id) {
        System.out.println("Removing User #" + id + " through UserServiceFactory");
        return true;
    }

}
