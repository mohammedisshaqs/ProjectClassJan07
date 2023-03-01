package com.aiite.executionpackage;

import com.aiite.basepackage.BaseClassEx;

public class HomePage {
	public static void main(String[] args) {
		BaseClassEx.browserLaunch();
		BaseClassEx.loadUrl("https://www.facebook.com/reg/");
	}

}
