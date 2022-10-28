package dbadapter.factory;

import dbadapter.db.DB;

public interface DBFactory {
    DB getDatabase();
}
