package com.mobile_tests.tests;

import com.mobile_tests.InterfacePages.*;
import com.mobile_tests.android.*;
import com.mobile_tests.ios.*;

public class BaseTest {

	protected final User user1;
	protected final User user2;

	public BaseTest() {
		String type = "check it in the XML file";
		switch (type) {
		case "iOS":
			user1 = new IosUser();
			user2 = new IosUser();
			break;
		case "Android":
			user1 = new AndroidUser();
			user2 = new AndroidUser();
			break;
		default:
			throw new UnsupportedOperationException();
		}
	}

}
