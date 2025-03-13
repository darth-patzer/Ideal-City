package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

public class KeyTracker implements KeyListener {
	
	private Map<Character, Boolean> pressedKeys = new HashMap<Character, Boolean>();

	@Override
	public void keyTyped(KeyEvent e) { }

	@Override
	public void keyPressed(KeyEvent e) {
		setPressedKeyValue(e.getKeyChar(), true);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		setPressedKeyValue(e.getKeyChar(), false);
	}
	
	private void setPressedKeyValue(char keyChar, boolean isPressed) {
		if(pressedKeys.containsKey(keyChar)) {
			pressedKeys.replace(keyChar, isPressed);
		} else {
			pressedKeys.put(keyChar, isPressed);
		}
	}
	
	public boolean isKeyPressed(char keyChar) {
		if(!pressedKeys.containsKey(keyChar))
			return false;
		
		return pressedKeys.get(keyChar);
	}
	
}
