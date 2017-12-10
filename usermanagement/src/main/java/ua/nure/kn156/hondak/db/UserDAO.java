package ua.nure.kn156.hondak.db;

import java.util.Collection;

import ua.nure.kn156.hondak.User;
/**
 * Interface for User class which implement DAO pattern with all CRUD opps
 * @author Ksenia
 *
 */

public interface UserDAO {
	/**
	 * Add user into DB users table and get new users id from db
	 * @param user all field of user must be non-null except of id field
	 * @return copy of user from db with id auto-created
	 * @throws DatabaseException in case of any error with db
	 */
	User  create(User user) throws DatabaseException;
	
	/**
	 * Find user into DB users table by user`s id and get all information about users from db
	 * @param id is used for searching of users in DB users table
	 * @return all information about users from db
	 * @throws DatabaseException in case of any error with db
	 */
	User find(Long id) throws DatabaseException; 
	
	/**
	 * Update all information about users into DB users table by user`s id	 
	 * @param user all field of user must be non-null except of id field
	 * @throws DatabaseException in case of any error with db
	 */
	void update(User user) throws DatabaseException;
	/**
	 * Delete all information about users into DB users table by user`s id	 
	 * @param user all field of user must be non-null except of id field
	 * @throws DatabaseException in case of any error with db
	 */
	void delete(User user) throws DatabaseException;
	/**
	 * Find information about all users into DB users table  
	 * @param a collection of all users from db
	 * @throws DatabaseException in case of any error with db
	 */
	Collection<User>findAll()throws DatabaseException;
	
	/**
     * Set the connection factory.
     *
     * @param connectionFactory is used for connection factory
     */
	void setConnectionFactory(ConnectionFactory connectionFactory);
	
	Collection<User>find(String firstName, String lastName)throws DatabaseException;



}
