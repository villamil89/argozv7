package com.myspace.argoz.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("User")
public class User implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("user")
	private java.lang.String user;
	@org.kie.api.definition.type.Label("fullName")
	private java.lang.String fullName;
	@org.kie.api.definition.type.Label("email")
	private java.lang.String email;
	
	public User() {
	}

	public java.lang.String getUser() {
		return this.user;
	}

	public void setUser(java.lang.String user) {
		this.user = user;
	}

	public java.lang.String getFullName() {
		return this.fullName;
	}

	public void setFullName(java.lang.String fullName) {
		this.fullName = fullName;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public User(java.lang.String user, java.lang.String fullName,
			java.lang.String email) {
		this.user = user;
		this.fullName = fullName;
		this.email = email;
	}

}