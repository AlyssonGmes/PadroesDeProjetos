package br.com.padroes.abstractfactory.app.service.factory;

import br.com.padroes.abstractfactory.app.service.services.CarEJBService;
import br.com.padroes.abstractfactory.app.service.services.CarRestApiService;

public class CarServiceFactory <T> implements ServicesAbstractFactory {

    private CarServiceFactory() {

    }

    @Override
    public T create(String servico) {
        if (servico.equalsIgnoreCase("CarEJBService")) {
            return (T) CarEJBService.getInstance();
        } else if (servico.equalsIgnoreCase("UserRestApiService")) {
            return (T) CarRestApiService.getInstance();
        } else {
            System.out.println("Serviço indisponível.");
            return null;
        }
    }

    public static CarServiceFactory getInstance(){
        return new CarServiceFactory();
    }
    @Override
    public void save(String model) {
        System.out.println("Saving " + model + " car through CarServiceFactory");
    }
    @Override
    public boolean delete(Integer id) {
        return false;
    }
    @Override
    public void update(String newModel) {
        System.out.println("Updating " + newModel + " car through CarServiceFactory");
    }

}
