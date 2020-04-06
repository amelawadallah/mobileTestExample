package com.mobile_tests.ios;

import com.mobile_tests.InterfacePages.*;
import com.mobile_tests.android.*;
import com.mobile_tests.commons.*;

public class IosUser extends BasePage implements User {

	private final IosHome home;
	private final IosRegistration registration;
	private final CreateUsersApi api;


	public IosUser() {
		this.home = new IosHome();
		this.registration = new IosRegistration();
		this.api = new CreateUsersApi();

	}

	public Home home() {
		// TODO Auto-generated method stub
		return home;
	}

	public Registration registration() {
		return registration;
	}

	public CreateUsersApi usersAPi() {
		// TODO Auto-generated method stub
		return api;
	}


}
