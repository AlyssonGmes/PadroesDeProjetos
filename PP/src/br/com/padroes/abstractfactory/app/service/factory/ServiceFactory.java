package br.com.padroes.abstractfactory.app.service.factory;

public class ServiceFactory implements ServicesAbstractFactory {
    ServicesAbstractFactory servico;

    public ServiceFactory() {

    }

    public void createCarServiceFactory() {
        servico = new CarServiceFactory();
    }

    public void createUserServiceFactory() {
        servico = new UserServiceFactory();
    }

}
