package wasseristnichtheiss;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class MElon {

	public static void main(String[] args) {
		  JFrame meinFrame = new JFrame("Beispiel JFrame");
		  meinFrame.setSize(200,200);
		  meinFrame.add(new JLabel("Beispiel JLabel"));
		  JFileChooser chooser = new JFileChooser();
		  chooser.showOpenDialog(null);
		  meinFrame.setVisible(true);

	}

}
