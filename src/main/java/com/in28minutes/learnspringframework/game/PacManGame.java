package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Move Up");

	}

	@Override
	public void down() {
		System.out.println("Move Down");

	}

	@Override
	public void left() {
		System.out.println("Move left");

	}

	@Override
	public void right() {
		System.out.println("Move Right");

	}



}
