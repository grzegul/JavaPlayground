package uzytki;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;
import java.io.*;

public class DisplayProperties implements SWTApplication {
	public void createContents(Composite parent) {
		parent.setLayout(new FillLayout());
		Text text = new Text(parent, SWT.WRAP | SWT.V_SCROLL);
		StringWriter props = new StringWriter();
		System.getProperties().list(new PrintWriter(props));
		text.setText(props.toString());
	}
	public static void main(String [] args) {
		SWTConsole.run(new DisplayProperties(), 800, 600);
	}
}