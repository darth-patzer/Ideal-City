package graphics;

import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;

public class GameLoop {
	
	private boolean running = true;
	
	public GameLoop() {
		initializeWindow();
		doGameLoop();
	}
	
	private void initializeWindow() {
		WindowManager.InitializeWindow();
		WindowManager.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				running = false;
			}
		});
	}

	private void doGameLoop() {
		long t = System.currentTimeMillis();
		int FPS = 0;
		while(running) {
			render();
			FPS++;
			if(System.currentTimeMillis() > t + 1000) {
				System.out.println("FPS: " + FPS);
				FPS = 0;
				t += 1000;
			}
		}
		stop();
	}
	
	private void render() {
		BufferStrategy bs = WindowManager.getBufferStrategy();
		Graphics g = bs.getDrawGraphics();
		
		//rendering logic
		g.fillRect(0, 0, 100, 100);
		
		g.dispose();
		bs.show();
	}
	
	private void stop() { }
	
}
