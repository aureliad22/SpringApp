package com.springapp.model;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import com.springapp.model.base.EntityBase;

@MappedSuperclass
@Inheritance
public abstract class User extends EntityBase {

	// The entity fields (private)

	@Column(name="email")
	@NotNull
	private String email;

	@Column(name="login")
	@NotNull
	private String login;

	@Column(name="firstname")
	@NotNull
	private String firstName;
	
	@Column(name="lastname")
	@NotNull
	private String lastName;
	
	@Column(name="password")
	@NotNull
	private String password;

	// Public methods

	public User() {
	}

	public User(Integer id) {
		super(id);
	}

	public User(String email, String password){
		this.email = email;
		this.password = password;
	}


	/**
	 * @param email
	 * @param login
	 * @param firstName
	 * @param lastName
	 * @param password
	 */
	public User(String email, String login, String firstName, String lastName, String password) {
		this.email = email;
		this.login = login;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
