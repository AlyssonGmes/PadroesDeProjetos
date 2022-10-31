package br.com.padroes.factory;

import br.com.padroes.factory.db.DB;
import br.com.padroes.factory.db.OracleDB;
import br.com.padroes.factory.factory.OracleDBFactory;
import br.com.padroes.factory.factory.PostgresDBFactory;

public class Client {
    public static void main(String[] args) {
        DB postgresDB;
        DB oracleDB;
        PostgresDBFactory pdbf = new PostgresDBFactory();
        OracleDBFactory odbf = new OracleDBFactory();

        postgresDB = pdbf.getDatabase();
        oracleDB = odbf.getDatabase();

        postgresDB.query("CREATE TABLE database.postgres");
        oracleDB.query("CREATE TABLE database.oracle");

        DB iOracle = new OracleDB();
        DB iPostgres = new OracleDB();

        iOracle.query("CREATE TABLE database.interface_oracle");
        iPostgres.query("CREATE TABLE database.interface_postgres");

        iOracle.update("DROP TABLE database.interface_oracle");
    }
}
