package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;

import camera.CameraService;
import camera.controller.WASDCameraController;
import geo.Point;

public class GameLoop {
	
	private boolean running;
	
	public GameLoop() {
		initializeWindow();
		setCameraController();
		
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
	
	private void setCameraController() {
		CameraService.setCameraController(new WASDCameraController());
		CameraService.setCameraPosition(new Point(500, 400));
	}

	private void doGameLoop() {
		
		running = true;
		
		long lastTime = System.nanoTime();
		double nanoSecondsPerTick = 1000000000 / 20;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int FPS = 0;
		
		while(running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / nanoSecondsPerTick;
			lastTime = now;
			while(delta >= 1) {
				tick();
				delta--;
			}
			if(running) {
				render();
			}
			FPS++;
			if(System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println("FPS: " + FPS);
				FPS = 0;
			}
		}
		
		stop();
	}
	
	private void tick() {
		CameraService.move();
	}
	
	private void render() {
		BufferStrategy bs = WindowManager.getBufferStrategy();
		Graphics g = bs.getDrawGraphics();
		
		//rendering logic
		
		g.setColor(Color.WHITE);
		Dimension screenSize = WindowManager.getScreenSize();
		g.fillRect(0, 0, screenSize.width, screenSize.height);

		g.setColor(Color.RED);
		
		Point cameraPoint = CameraService.getCameraPosition();
		
		g.fillRect(cameraPoint.getX() + 10, cameraPoint.getZ() + 10, 20, 20);
		
		g.dispose();
		bs.show();
	}
	
	private void stop() { }
	
}
