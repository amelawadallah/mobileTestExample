package com.mobile_tests.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

	@Test
	public void   checkNewMessages() {
		user1.home().clickHomePageIcon();
		user1.home().clickMessagesIcon();
		
		assertThat(user1.home().doesHaveNewMessages()).isTrue();
		
	}
	
	
	
	@Test
	public void registration() {
		user1.registration().clickCreateAccount();
		user1.registration().fillEmail();
		user1.registration().fillPassword();
		user1.registration().fillCode();
		assertThat(user1.registration().isAccountCreated()).isTrue();
		
	}
}
