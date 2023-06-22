package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.ConcatBlocksListener;
import controller.FormEvent;

/**
 * The GUI class represents the graphical user interface of the Block Printer
 * application.
 */
public class GUI extends JFrame {
	private JTextField inputField;
	private JTextArea textArea;
	private ConcatBlocksListener concatBlocksListener;

	/**
	 * Constructs an instance of the GUI class. Sets up the layout and components of
	 * the GUI.
	 */
	public GUI() {
		setTitle("Block Printer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		// Input Panel
		JPanel inputPanel = new JPanel(new FlowLayout());
		inputField = new JTextField(20);
		inputPanel.add(inputField);

		// Button Panel
		JPanel buttonPanel = new JPanel(new FlowLayout());
		JButton printButton = new JButton("Print Blocks");
		buttonPanel.add(printButton);

		// Text Area
		textArea = new JTextArea(10, 100);
		Font font = new Font(Font.MONOSPACED, Font.BOLD, 12);
		textArea.setFont(font);
		textArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(textArea);

		// Add components to the frame
		add(inputPanel, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.CENTER);
		add(scrollPane, BorderLayout.SOUTH);

		// Register button action listener
		printButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String fullName = inputField.getText();
				if (concatBlocksListener != null) {
					StringBuilder blocksText = fireEvent(new FormEvent(fullName));
					if (blocksText != null) {
						textArea.setText(blocksText.toString());
					} else {
						textArea.setText("");
					}
				}
			}
		});

		pack();
		setLocationRelativeTo(null); // Center the window
		setVisible(true);
	}

	/**
	 * Sets the ConcatBlocksListener for handling concatenation events.
	 *
	 * @param concatBlocksListener The ConcatBlocksListener to be set.
	 */
	public void setConcatBlocksListener(ConcatBlocksListener concatBlocksListener) {
		this.concatBlocksListener = concatBlocksListener;
	}

	/**
	 * Fires a FormEvent and passes it to the ConcatBlocksListener for
	 * concatenation.
	 *
	 * @param event The FormEvent to be fired.
	 * @return The concatenated blocks text as a StringBuilder, or null if
	 *         concatenation failed.
	 */
	public StringBuilder fireEvent(FormEvent event) {
		if (concatBlocksListener != null) {
			return concatBlocksListener.concatPerformed(event);
		}
		return null;
	}
}
