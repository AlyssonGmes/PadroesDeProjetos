package br.com.padroes.factory.factory;


import br.com.padroes.factory.db.DB;
import br.com.padroes.factory.db.PostgresDB;

public class PostgresDBFactory implements DBFactory {

    PostgresDB dbPostgres;

    public PostgresDBFactory() {
        dbPostgres = new PostgresDB();
    }

    @Override
    public DB getDatabase() {
        return dbPostgres;
    }
}
