package br.com.padroes.abstractfactory.app.service.services;

public class CarEJBService implements CarService {

    private CarEJBService() {

    }

    public static CarEJBService getInstance() {
        return new CarEJBService();
    }

    @Override
    public void save(String model) {
        System.out.println("Saving " + model + " car through EJB's interface");
    }

    @Override
    public void update(String newModel) {
        System.out.println("Updating " + newModel + " car through EJB's interface");
    }

}
