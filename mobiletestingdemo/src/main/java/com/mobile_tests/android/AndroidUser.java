package com.mobile_tests.android;

import com.mobile_tests.InterfacePages.*;
import com.mobile_tests.api.*;

public class AndroidUser implements User {

	private final AndroidHome home;
	private final AndroidRegistration registration;
	
	private final CreateUsersApi api;

	public AndroidUser() {
		this.home = new AndroidHome();
		this.registration = new AndroidRegistration();
		this.api = new CreateUsersApi();
	}

	public Home home() {
		// TODO Auto-generated method stub
		return home;
	}

	public Registration registration() {
		// TODO Auto-generated method stub
		return registration;
	}

	public CreateUsersApi usersAPi() {
		// TODO Auto-generated method stub
		return api;
	}

}
