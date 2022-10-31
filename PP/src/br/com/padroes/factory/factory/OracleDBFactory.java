package br.com.padroes.factory.factory;

import br.com.padroes.factory.db.DB;
import br.com.padroes.factory.db.OracleDB;

public class OracleDBFactory implements DBFactory{

    OracleDB dbOracle;

    public OracleDBFactory(){
        dbOracle = new OracleDB();
    }
    @Override
    public DB getDatabase() {
        return dbOracle;
    }
}
