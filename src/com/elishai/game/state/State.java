package com.elishai.game.state;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import com.elishai.game.main.GameMain;

public abstract class State {
	
	public abstract void init();
	
	public abstract void update();
	
	public abstract void render(Graphics g);
	
	public abstract void onCLick(MouseEvent e);
	
	public abstract void onKeyPress(KeyEvent e);
	
	public abstract void onKeyRelease(KeyEvent e);
	
	public void setCurrentState(State newState) {
		GameMain.mGame.setCurrentState(newState);
	}
}
