package br.com.padroes.factory.factory;

import br.com.padroes.factory.db.DB;

public interface DBFactory {
    DB getDatabase();
}
