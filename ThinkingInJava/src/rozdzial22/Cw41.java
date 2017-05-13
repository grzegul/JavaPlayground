package rozdzial22;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;
import java.util.*;
public class Cw41 {
	public static void main(String [] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Cwiczenie 41");
		shell.setLayout(new FillLayout());
		Text text = new Text(shell, SWT.WRAP | SWT.V_SCROLL);
		for(Map.Entry entry: System.getenv().entrySet()) {
			text.append(entry.getKey() + ": " +
					entry.getValue() + "\n");
		}
		shell.open();
		while(!shell.isDisposed())
			if(!display.readAndDispatch())
				display.sleep();
		display.dispose();
	}
}