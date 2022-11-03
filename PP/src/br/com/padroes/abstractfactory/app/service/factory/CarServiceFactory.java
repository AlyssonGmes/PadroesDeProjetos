package br.com.padroes.abstractfactory.app.service.factory;

import br.com.padroes.abstractfactory.app.service.services.CarEJBService;
import br.com.padroes.abstractfactory.app.service.services.CarRestApiService;
import br.com.padroes.abstractfactory.app.service.services.CarService;

public class CarServiceFactory implements CarService, ServicesAbstractFactory {
    CarService carService;

    public CarServiceFactory() {

    }

    public void createCarEJBService() {
        this.carService = new CarEJBService();
    }

    public void createCarRestApiService() {
        this.carService = new CarRestApiService();
    }

    public CarService getCarService() {
        return carService;
    }

    @Override
    public void save(String model) {
        System.out.println("Saving " + model + " car through CarServiceFactory");
    }


    @Override
    public void update(String newModel) {
        System.out.println("Updating " + newModel + " car through CarServiceFactory");
    }

}
