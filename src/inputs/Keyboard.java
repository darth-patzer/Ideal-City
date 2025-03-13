package inputs;

public class Keyboard {
	
	private static KeyTracker keyboardTracker = new KeyTracker();
	
	public static KeyTracker getKeyboardTracker() {
		return keyboardTracker;
	}
	
	public static boolean isKeyPressed(char keyChar) {
		return keyboardTracker.isKeyPressed(keyChar);
	}
	
	public static boolean isKeyPressed(String keyString) {
		return keyboardTracker.isKeyPressed(keyString.charAt(0));
	}

}
