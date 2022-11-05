package br.com.padroes.abstractfactory.app.service.factory;

import br.com.padroes.abstractfactory.app.service.services.CarService;
import br.com.padroes.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory<T> extends CarService, UserService {

    public T create(String servico);
    @Override
    public void save(String model);
    @Override
    public void update(String newModel) ;
    @Override
    public boolean delete(Integer id);
}
