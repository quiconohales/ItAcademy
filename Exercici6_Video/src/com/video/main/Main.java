package com.video.main;

import com.video.view.InputManager;

public class Main {

	public static void main(String[] args) {
		InputManager ui = new InputManager();
		ui.showMenu();
		ui.close();
	}

}
