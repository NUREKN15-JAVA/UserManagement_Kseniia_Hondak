package ua.nure.kn156.hondak.db;

import java.sql.Connection;

public interface ConnectionFactory {
	Connection createConnection()throws DatabaseException;

}
