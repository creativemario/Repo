package uk.co.reformtheempire.games.minesweeper.gui.desktop;

import uk.co.reformtheempire.games.minesweeper.gui.MinesweeperGUI;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Color;

public class DesktopLauncher {
	public static void main(String[] arg) {
		final LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = MinesweeperGUI.TITLE + " | " + MinesweeperGUI.VERSION;
		config.addIcon("img/window_icon.png", Files.FileType.Internal);
		config.vSyncEnabled=true;
		config.initialBackgroundColor = Color.BLACK;
		config.width = 1280;
		config.height = 720;
		config.fullscreen = false;	
		
		new LwjglApplication(new MinesweeperGUI(), config);
	}
}
