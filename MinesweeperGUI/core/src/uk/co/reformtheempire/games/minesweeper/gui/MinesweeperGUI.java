package uk.co.reformtheempire.games.minesweeper.gui;

import uk.co.reformtheempire.games.minesweeper.gui.screens.Splash;

import com.badlogic.gdx.Game;

public class MinesweeperGUI extends Game{

	public static final String TITLE = "RTE-Minesweeper";
	public static final String VERSION = "DEV-MODE";
	
	
	@Override
	public void create() {
		setScreen(new Splash());
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}

	@Override
	public void dispose() {
		super.dispose();
	}
}
