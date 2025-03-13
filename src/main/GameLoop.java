package main;

import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;

import camera.Camera;
import camera.movement.VelocityMovementStrategy;
import city.AbstractCity;
import city.PointCity;
import geo.Location;
import geo.Point;
import graphics.Renderer;
import graphics.WindowManager;

public class GameLoop {
	
	private boolean running = false;
	
	private AbstractCity city;
	
	public GameLoop() {
		initializeWindow();
		Camera.initializeCamera(new VelocityMovementStrategy(), new Point(500, 400));
		city = new PointCity("Barnesville", new Location(500, 0));
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
		Camera.move();
	}
	
	private void render() {
		BufferStrategy bs = WindowManager.getBufferStrategy();
		Graphics g = bs.getDrawGraphics();
		Renderer.setGraphics(g);
		
		//rendering logic
		Renderer.drawBackground();

		Renderer.drawPoint(new Point(0, 0));
		
		city.render();
		
		Renderer.clearGraphics();
		g.dispose();
		bs.show();
	}
	
	private void stop() { }
	
}
