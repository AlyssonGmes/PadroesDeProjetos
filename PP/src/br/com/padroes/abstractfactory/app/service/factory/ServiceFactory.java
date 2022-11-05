package br.com.padroes.abstractfactory.app.service.factory;

public class  ServiceFactory <T> implements ServicesAbstractFactory {

    public ServiceFactory() {

    }

    @Override
    public T create(String servico) {
        if (servico.equalsIgnoreCase("User")) {
            return (T) UserServiceFactory.getInstance();
        } else if (servico.equalsIgnoreCase("Car")) {
            return (T) CarServiceFactory.getInstance();
        } else {
            System.out.println("Serviço indisponível.");
            return null;
        }
    }

    @Override
    public void save(String model) {
        System.out.println("Saving " + model + " service through ServicesAbstractFactory");
    }

    @Override
    public void update(String newModel) {
        System.out.println("Updating " + newModel + " service through ServicesAbstractFactory");

    }

    @Override
    public boolean delete(Integer id) {
        System.out.println("Removing User #" + id + " through ServicesAbstractFactory");
        return true;
    }

}
