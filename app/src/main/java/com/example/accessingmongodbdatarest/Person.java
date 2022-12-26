package com.example.accessingmongodbdatarest;

import org.apache.logging.log4j.util.ProviderUtil;
import org.springframework.data.annotation.Id;

public class Person {

	@Id private String id;

	private String firstname;
	private String lastname;

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
}
