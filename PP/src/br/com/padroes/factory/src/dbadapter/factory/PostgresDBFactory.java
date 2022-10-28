package dbadapter.factory;

import dbadapter.db.DB;
import dbadapter.db.PostgresDB;

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
