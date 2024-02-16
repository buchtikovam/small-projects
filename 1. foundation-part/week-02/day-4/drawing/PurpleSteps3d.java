import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
	public static void drawImage(Graphics graphics) {
		// Reproduce this:
		// [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]
		int x = 0;
		int y = 0;
		int size = 15;
		for (int i = 0; i < 6; i++) {
			graphics.setColor(new Color(0x800080));
			x += size - 10;
			y += size - 10;
			graphics.fillRect(x, y, size, size);
			size += 10;
		}


	}

	// Don't touch the code below
	static int WIDTH = 500;
	static int HEIGHT = 500;

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Drawing");
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImagePanel panel = new ImagePanel();
		panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		jFrame.add(panel);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);
		jFrame.pack();
	}

	static class ImagePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics graphics) {
			super.paintComponent(graphics);
			drawImage(graphics);
		}
	}
}