package utils;

import graphics.WindowManager;

public class TextUtils {
	
	public static int getStringLength(String string) {
		return WindowManager.getFontMetrics().stringWidth(string);
	}

}
