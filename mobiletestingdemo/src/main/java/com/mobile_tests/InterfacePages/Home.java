package com.mobile_tests.InterfacePages;

import java.util.List;

public interface Home {

	void clickHomePageIcon();

	boolean pageIsOpened();

	List<String> getConverationNames();

	boolean doesHaveNewMessages();

}
