

import javax.swing.SwingUtilities;

import controller.BlockListProvider;
import controller.BlocksConcatenator;
import view.GUI;

/**
 * displays the initials in large block letters. Makes each large letter out of
 * the corresponding regular character
 * 
 * @author Abdulrahman Tawfeeq.
 *
 */
public class Application {

	public static void main(String[] args) {
		// Create and run the application on the Event Dispatch Thread
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				runApp();
			}
		});
	}

	/**
	 * Initializes the application by creating instances of the model, view, and
	 * controller classes and establishing the necessary connections between them.
	 */
	public static void runApp() {
		// Create the model
		BlockListProvider model = new BlockListProvider();

		// Create the view
		GUI view = new GUI();

		// Create the controller and pass the model
		BlocksConcatenator controller = new BlocksConcatenator(model);

		// Set the controller as the listener for concatenation events in the view
		view.setConcatBlocksListener(controller);
	}
}
