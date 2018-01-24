import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class comboBox extends JFrame {
	private JComboBox list;
	private static String[] colornames = {"Yellow", "Red", "Orange", "Green"};
	private static Color[] colors = {Color.YELLOW, Color.RED, Color.ORANGE, Color.GREEN};
	
	public comboBox() {
		super("JComboBox Demo");
		setLayout(new FlowLayout());
		
		list = new JComboBox(colornames);
		list.addItemListener(
				new ItemListener() {
					public void itemStateChanged(ItemEvent event) {
						getContentPane().setBackground(colors[list.getSelectedIndex()]);
					}
				}
				);
		add(list);
	}
}
