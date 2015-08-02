package uk.co.reformtheempire.games.minesweeper.gui.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import uk.co.reformtheempire.games.minesweeper.gui.MinesweeperGUI;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new MinesweeperGUI(), config);
	}
}
