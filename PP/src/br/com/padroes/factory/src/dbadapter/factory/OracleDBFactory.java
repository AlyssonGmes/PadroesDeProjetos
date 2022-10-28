package dbadapter.factory;

import dbadapter.db.DB;
import dbadapter.db.OracleDB;

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
